package info.duhovniy.imcloud;

import org.apache.commons.io.IOUtils;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

// NOTE:
// This class emulates a server for the purposes of this sample,
// but it's not meant to serve as an example for a production app server.
// This class should also not be included in the client (Android) application
// since it includes the server's API key. For information on GCM server
// implementation see: https://developers.google.com/cloud-messaging/server
public class GcmSender {

	public static String sendToGcm(Message m) {
		String resp = null;

		try {
			// Prepare JSON containing the GCM message content. What to send and
			// where to send.
			JSONObject jGcmData = new JSONObject();
			JSONObject jData = new JSONObject();
			jData.put("message", m.getMessage());
			// Where to send GCM message.
			if (m.hasRecipient()) {

				jGcmData.put("to", MySQLDBHandler.getUser(m.getTo().trim()).getRegistration_id());
			} else {
				jGcmData.put("to", "/topics/global");
			}
			// What to send in GCM message.
			jGcmData.put("data", jData);

			// Create connection to send GCM Message request.
			URL url = new URL(NetConstant.GATE_URL);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestProperty("Authorization", "key=" + NetConstant.API_KEY);
			conn.setRequestProperty("Content-Type", "application/json");
			conn.setRequestMethod("POST");
			conn.setDoOutput(true);

			// Send GCM message content.
			OutputStream outputStream = conn.getOutputStream();
			outputStream.write(jGcmData.toString().getBytes());

			// Read GCM response.
			InputStream inputStream = conn.getInputStream();
			resp = IOUtils.toString(inputStream);
			System.out.println(resp);
			System.out.println("Check your device/emulator for notification or logcat for "
					+ "confirmation of the receipt of the GCM message.");
		} catch (IOException e) {
			System.out.println("Unable to send GCM message.");
			System.out.println("Please ensure that API_KEY has been replaced by the server "
					+ "API key, and that the device's registration token is correct (if specified).");
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return resp;
	}

}
