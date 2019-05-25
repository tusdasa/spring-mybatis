package ssm.utils;

public class PageUtils {
	public static int pagesize = 6;

	public PageUtils() {
	}

	
	public static int getPagetoal(long pagetoal,int size) {
		if(pagetoal<size) {
			return 1;
		}else {
			if(pagetoal>size) {
				return (int) Math.ceil((double) pagetoal/size );
			}else {
				return 1;
			}
		}
	}

}
