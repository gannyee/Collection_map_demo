import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class CollectionTest {

	/**
	 * ��Ҫ��ɣ�
	 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
	 * 2.��String���͵�List��������
	 * 3.���������ͷ��͵�List����������StudentΪ����
	 */
	
	/**
	 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
	 * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ����������
	 * ����Collections.sort()���������������
	 */
	public void testSort1(){
		List<Integer>integerList = new ArrayList<Integer>();
		//����ʮ��100���ڵĲ��ظ��������
		Random random = new Random();
		Integer k;
		for(int i = 0;i < 10;i ++){
			do{
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������" + k);
			
		}
		System.out.println("----------����ǰ-----------" );
		for(Integer integer:integerList){
			System.out.println("Ԫ�أ�" + integer);
		}
		Collections.sort(integerList);
		System.out.println("----------�����-----------" );
		for(Integer integer:integerList){
			System.out.println("Ԫ�أ�" + integer);
		}
	}
	
	/**
	 * 2.��String���͵�List��������
	 * ����String���͵�List��������������StringԪ�أ�
	 * ����sort�������ٴ����������˳��
	 */
	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("------------����ǰ-------------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
		Collections.sort(stringList);
		System.out.println("--------------�����---------------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CollectionTest ct = new CollectionTest();
		ct.testSort1();
		ct.testSort2();
	}

}
