package org.phone;

public class PhoneInfo {
private void phoneName(String a) {
	System.out.println("phoneName = OnePlus");
}
 private void phoneImei(long a) {
	System.out.println("phoneImei = 125476323l");
}
 private void Camera(String a) {
	System.out.println("Camera = 108mb");
}
 private void Storage(int i) {
	System.out.println("Storage = 256");
}
 private void osName(String a) {
	System.out.println("osName = color");
}
public static void main(String[] args) {
	PhoneInfo Class = new PhoneInfo ();
	Class.phoneName("oneplus");
Class.Camera("108mp");
Class.Storage(256);
Class.osName("android");
Class.phoneImei(676368375l);

}
}
