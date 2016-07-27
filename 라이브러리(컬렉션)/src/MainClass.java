import java.util.ArrayList;

/*
 * �÷��� �����ӿ�ũ(Collection Framework)
 * 
 * - �迭 ������
 * 		: 1) ������ �� �ִ� ��ü���� �迭�� ������ �� ������
 * 			��Ư�� �ټ��� ��ü�� �����ϱ⿡�� ������ ��.
 * 		  2) ��ü �������� �� �ش� �ε����� ��� ��
 * 			��ü�� �����Ϸ��� ��� ����ִ��� Ȯ���ؾ���
 * 
 * 	- �÷��� �����ӿ�ũ
 * 		: ��ü���� ȿ�������� �߰�, ����, �˻��Ҽ� �ֵ��� �����ϴ� �÷��� ���̺귯��
 * 		�������̽��� ���ؼ� ����ȭ�� ������� �پ��� �÷��� Ŭ���� �̿�
 * 		- �÷����� ���ʸ�(Generic) ������� ������.
 * 		- ���ظ� : Ư�� Ÿ�Ը� �ٷ��� �ʰ�, ���� ������ Ÿ������ ������ �� �ֵ��� Ŭ������ �޼ҵ带 �Ϲ�ȭ��Ű�� ���
 * 				- <E>, <K>,<V> : Ÿ�� �Ű� ���� (��� Ÿ���� �Ϲ�ȭ�� Ÿ��)
 * 				- ��) ���ظ� ���� : Vector<E>
 * 					E�� Ư�� Ÿ������ ��üȭ
 * 					������ �ٷ�� ���� Vector<Integer>
 * 					���ڿ��� �ٷ�� ����Vector<String>
 * 	- �÷��� Ŭ����
 * 		List	Set	Map ==> �������̽�
 * 		List => ArrayList, Vector, LinkedList, Queue, Stack
 * 				========== ======
 * 			= ������ �����ϰ� �ִ�.(�� �����͸��� index�� ������ ����)
 * 			= �ߺ� ����Ѵ�.
 * 			= �����ͺ��̽� ���α׷�
 * 
 * 		Set => TreeSet,HashSet
 * 			= ������ ����
 * 			= �ߺ� ������� �ʴ´�
 * 			= XML ���α׷�
 * 
 * 		Map = Hashtable, HashMap
 * 			= ������ �ִ�
 * 			= �ߺ����(Value), �ߺ�������� ����(Key)
 * 			= Key, Value�� ���ÿ� ����
 * 			= Ŭ���� ����, �����ȣ ... (Spring)
 * 			= ������ (MapReduce)
 * 			�� ==>
 * 				a.jsp ==> b.jsp : id, pwd
 * 				b.jsp?id=aaa&pwd=1234
 * 				�Ϲ� ���α׷� => �����͸� ������ �� �޼ҵ��� �Ű�����
 * 
 * 	- ArrayList => Ŭ������ ������ ����(����� ����, ���̺귯��)
 * 		= add(��ü��) ����(�ڿ� �ٴ´�)
 * 			add(index, ��ü��) (���ϴ� ��ġ�� ����)
 * 			INSERT INTO ~~
 * 			insert()
 * 		= remove(index) => ������ ����
 * 			DELETE ~ SET
 * 			delete()
 * 		= set(index, ��ü��) => ������ ����
 * 			UPDATE ~ SET
 * 			update()
 * 		=get(index, ��ü��) => ������ �˻�
 * 			Select ~ from
 * 			find()
 * 		= size() = ���� ����
 * 			select count (*) from ~
 * 			count()
 * 
 * 			
 * 			A a = new A();
 * 			add(a)
 * 			========
 * 				a ======>100 
 * 			========
 * 				0
 * 
 * 			A b = New A();
 * 			add(b)
 * 			========	========
 * 				a			b
 * 			========	========
 * 				0			1
 * 
 * 			A c = new A();
 * 			add(1, c)
 * 			========	========	========
 * 				a			c			b
 * 			========	========	========
 * 			remove()
 * 			========	========
 * 				a			b
 * 			========	========
 * 				0			1
*/
public class MainClass {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//Integer i =10;
		list.add(10);
		list.add(15.5);
		list.add("�̼���");
		list.add(1,'A');
		System.out.println("���� ���� : "+list.size());
		
		int a = (int) list.get(0);
		double b =(double)list.get(2);
		String c = (String)list.get(3);
		char d = (char)list.get(1);
		
		System.out.println("Index : 0 =>"+a);
		System.out.println("Index : 1 =>"+b);
		System.out.println("Index : 2 =>"+d);
		System.out.println("Index : 3 =>"+c);
		System.out.println();
		
		
		ArrayList<String> list2 = new ArrayList<>();
		//Object => String
		list2.add("�̹��");
		list2.add("�Ϸ�");
		list2.add("�ξ�");
		list2.add("�ֿ�");
		list2.add("������");
		
		for(int i =0; i<list2.size(); i++){
			String name=list2.get(i);
			System.out.println("index : "+(i)+"=>"+name);
		}
		//for-each(�迭, �÷���)
		for(String name : list2){
			System.out.println(name);
		}
	}
}
