package p433_p440;



public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new CheckBox.OnSelectListener() {
			
			@Override
			public void onSelect() {
			System.out.println("배경을 변경");
				
			}
		
		});
		cb.select();
	}

}
