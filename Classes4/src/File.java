
public class File {

	private String mFileName;
	private String mFileExtencion;
	private long mFileSize;
	/**
	 * @param mFileName
	 * @param mFileExtencion
	 * @param mFileSize
	 */
	public File(String mFileName, String mFileExtencion, long mFileSize) {
		super();
		this.mFileName = mFileName;
		this.mFileExtencion = mFileExtencion;
		this.mFileSize = mFileSize;
	}
	/**
	 * @return the mFileName
	 */
	public String getmFileName() {
		return mFileName;
	}
	/**
	 * @param mFileName the mFileName to set
	 */
	public void setmFileName(String mFileName) {
		this.mFileName = mFileName;
	}
	/**
	 * @return the mFileExtencion
	 */
	public String getmFileExtencion() {
		return mFileExtencion;
	}
	/**
	 * @param mFileExtencion the mFileExtencion to set
	 */
	public void setmFileExtencion(String mFileExtencion) {
		this.mFileExtencion = mFileExtencion;
	}
	/**
	 * @return the mFileSize
	 */
	public long getmFileSize() {
		return mFileSize;
	}
	/**
	 * @param mFileSize the mFileSize to set
	 */
	public void setmFileSize(long mFileSize) {
		this.mFileSize = mFileSize;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return mFileName + "."
				+ mFileExtencion + " Size=" + mFileSize + " bytes";
	}
	
	
	
	
	
}
