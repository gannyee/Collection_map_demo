import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class MapTest {

	/**
	 * �����н�ѧ�����Ͷ���
	 */
	public Map<String,Student>students;
	
	/**
	 * �ڹ������г�ʼ��students����
	 * @param args
	 */
	public MapTest(){
		this.students = new HashMap<String,Student>();
	}
	
	/**
	 * ������ӣ�����ѧ��ID���ж��Ƿ�ռ��
	 * ��ռ�á�������������������ѧ�����󣬲�����ӵ�students��
	 * @param args
	 */
	public void testPut(){
		//����Scanner����������ȡ�����ѧ��ID������
		Scanner console = new Scanner(System.in);
		int i = 0;
		while(i < 3){
			System.out.println("������ѧ��ID");
			String ID = console.next();
			//�ж�ID�Ƿ�ռ��
			Student st = students.get(ID);
			if(st == null){
				//��ʾ����ѧ������
				System.out.println("������ѧ������:");
				String name = console.next();
				//�����µ�ѧ������
				Student newStudent = new Student(ID,name);
				//ͨ������students��put���������ID-ѧ��ӳ��
				students.put(ID, newStudent);
				System.out.println("�ɹ����ѧ����" + students.get(ID).name);
				i ++;
			}else{
				System.out.println("��ѧ��ID�ѱ�ռ�ã�");
				continue;
			}
			
		}
	}
	
	/**
	 * ����Map��keySet����
	 * @param args
	 */
	public void testKeySet(){
		//ͨ��keySet����������Map�е�����"��"��Set����
		Set<String>keySet = students.keySet();
		//ȡ��students������
		System.out.println("�ܹ���" + students.size() + "��ѧ��");
		//����keySet,ȡ��ÿһ�������ڵ���get()����ȡ��ÿһ������Ӧ��value
		for(String stuID:keySet){
			Student st = students.get(stuID);
			if(st != null)
				System.out.println("ѧ��:" + st.name);
		}
	}
	
	/**
	 * ����ɾ��Map�е�ӳ��
	 * @param args
	 */
	public void testRemove(){
		//��ʾ�����ɾ����ѧ��ID
		
		Scanner console = new Scanner(System.in);
		while(true){
			System.out.println("������Ҫɾ����ѧ��ID��");
			String ID = console.next();
			//�ж�ID�Ƿ��ж�Ӧ��ѧ������
			Student st = students.get(ID);
			if(st == null){
				//��ʾ����ID������
				System.out.println("��ID������");
				continue;
			}
			students.remove(ID);
			System.out.println("�ɹ�ɾ��ѧ����" + st.name);
			break;
		}
	}
	/**ͨ��entrySet��������Map
	 * 
	 * @param args
	 */
	public void testEntrySet(){
		//ͨ��entrySet����������Map�����м�ֵ��
		Set<Entry<String,Student>>entrySet = students.entrySet();
		for(Entry<String,Student>entry:entrySet){
			System.out.println("ȡ�ü�:" + entry.getKey());
			System.out.println("��Ӧ��ֵΪ:" + entry.getValue().name);
			
		}
	}
	/**
	 * ����put�޸�Map�����е�ӳ��
	 * @param args
	 */
	public void testModify(){
		//��ʾ����Ҫ�޸ĵ�ѧ��ID
		System.out.println("������Ҫ�޸ĵ�ѧ��ID��");
		//����һ��Scanner����ȥ��ȡҪ�޸ĵ�ѧ��ID
		Scanner console = new Scanner(System.in);
		while(true){
			//����ȡ�Ӽ��������ѧ��ID
			String stuID = console.next();
			//��students�в��Ҹ�ѧ����Ӧ��ѧ������
			Student student = students.get(stuID);
			if(student == null){
				System.out.println("��ID�����ڣ����������룡��");
				continue;
			}
			System.out.println("��ǰ��ѧ��ID������Ӧ��ѧ��Ϊ:" + student.name);
			System.out.print("��������ѧ����������");
			String name = console.next();
			Student newStudent = new Student(stuID,name);
			students.put(stuID, newStudent);
			System.out.println("�޸ĳɹ�");
			break;
		}
	}
	/**
	 * ����Map���Ƿ����ĳ��keyֵ��valueֵ
	 * @param args
	 */
	public void testContainsKeyOrValue(){
		//��ʾ����ѧ��id
		System.out.println("������Ҫ��ѯѧ��ID");
		Scanner console = new Scanner(System.in);
		String id = console.next();
		//Map�У���containskey()�������ж��Ƿ����ĳ��keyֵ
		System.out.println("�������ѧ��IDΪ��" + id + ",��ѧ��ӳ������Ƿ����:"
				+ students.containsKey(id));
		if(students.containsKey(id))
			System.out.println("��Ӧ��ѧ��Ϊ��" + students.get(id).name);
		//��containsValue()�������ж��Ƿ����ĳ��Valueֵ
		System.out.println("������Ҫ��ѯѧ��������");
		String name = console.next();
		//��containsValue()�������ж��Ƿ����ĳ��Valueֵ
		if(students.containsValue(new Student(null,name)))
			System.out.println("��ѧ��ӳ����У�ȷʵ����ѧ��" + name);
		else 
			System.out.println("��ѧ��ӳ����У�������ѧ��" );
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
//		mt.testRemove();
//		mt.testEntrySet();
//		mt.testModify();
//		mt.testEntrySet();
		mt.testContainsKeyOrValue();
	}

}
