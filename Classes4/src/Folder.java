

public class Folder {

	private String mFolderName;
	private static final int MAX_FILES_NUMBER = 10;
	private File[] mFileSystem = new File[MAX_FILES_NUMBER];
	/**
	 * Constructor of Folder
	 * @param mFolderName
	 */
	public Folder(String folderName) {
		mFolderName = folderName;
	}
	
	public long totalFilesSize() {
		
		long totalFilesSize = 0;
		
		for (int i = 0; i < MAX_FILES_NUMBER; i++) {
			if(mFileSystem[i] != null) {
				totalFilesSize += mFileSystem[i].getmFileSize();
			}
		}
		
		return totalFilesSize;
	}
	
	public long maxFileSize() {
		long maxFileSize = 0;

		for (int i = 0; i < MAX_FILES_NUMBER; i++) {
			if(mFileSystem[i] != null) {
				if (mFileSystem[i].getmFileSize() > maxFileSize) {
					maxFileSize = mFileSystem[i].getmFileSize();
				}
			}
		}
		
		return maxFileSize;
	}
	
	public long minFileSize() {
		long minFileSize = 0;

		for (int i = 0; i < MAX_FILES_NUMBER; i++) {
			if(mFileSystem[i] != null) {
				if (mFileSystem[i].getmFileSize() < minFileSize) {
					minFileSize = mFileSystem[i].getmFileSize();
				}
			}
		}
		
		return minFileSize;
	}
	
	
}
