import java.util.ArrayList;

public class MainClass2 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//ArrayList<SawonVO> list = new ArrayList<>();
		list.add("�̹��"); 	//0
		list.add("�Ϸ�");	//2
		list.add("�ξ�");	//3
		list.add("�ֿ�");	//4
		list.add("������");	//5
		
		list.add(1, "������");
		list.add(3, "�̼���");
		System.out.println("���� ���� : "+list.size());
		
		for(int i=0; i<list.size(); i++){
			String name = list.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		
		System.out.println("3��° ����");
		
		list.remove(3);
		
		for(String name : list){
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("2�� ����");
		list.set(2, "�̿�");
		
		for(String name : list){
			System.out.println(name);
		}
		
		System.out.println();
		System.out.println("��ü����");
		list.clear();
		
		for(String name : list){
			System.out.println(name);
		}
		
		
	}
}
