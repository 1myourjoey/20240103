package spring;

import lombok.Setter;

@Setter
public class VersionPrinter {
	private int majorVersion;
	private int minorVersion;
	
	public void print() {
		System.out.printf("this program version is %d.%d. \n\n",
				majorVersion, minorVersion);
	}

//	public void setMajorVersion(int majorVersion) {
//		this.majorVersion = majorVersion;
//	}
//
//	public void setMinorVersion(int minorVersion) {
//		this.minorVersion = minorVersion; // 롬복 가능
//	}
	
}
