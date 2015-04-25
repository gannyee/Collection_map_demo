import java.util.ArrayList;
import java.util.List;


public class TestGeneric {
	/**
	 * ���з���--course����˹����������
	 */
	public List<Course> courses;
	
	public TestGeneric(){
		this.courses = new ArrayList<Course>();
	}
	/**
	 * �������
	 * @param args
	 */
	public void testAdd(){
		Course cr1 = new Course("1","��ѧ����");
		courses.add(cr1);
		
		//���ͼ����в�����ӷ��͹涨���ͼ���������������ĵĶ��󣬷���ᱨ��
		//courses.add("�ܷ����һЩ��ֵ�Ԫ��");
		Course cr2 = new Course("2","JAVA����");
		courses.add(cr2);
	}
	
	/**
	 * ����ѭ������
	 * @param args
	 */
	public void testForEach(){
		for(Course cr:courses){
			System.out.println(cr.id + ":" + cr.name);
		}
	}
	/**
	 * ���ͼ��Ͽ�����ӷ��͵������Ͷ���ʵ��
	 * @param args
	 */
	public void testChild(){
		ChildCourse ccr = new ChildCourse();
		ccr.id = "3";
		ccr.name = "���������Ͷ���ʵ��";
		courses.add(ccr);
	}
	/**
	 * ���ͼ������޶������� ����ʹ�û�����������
	 *����ͨ��ʹ�ð�װ�޶��������Ļ�����������
	 * @param args
	 */
	public void testBasicType(){
		List<Integer>list = new ArrayList<Integer>();
		list.add(1);
		System.out.println("�������ͱ���ʹ�û������͵İ�װ����Ϊ����" + list.get(0));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGeneric tg = new TestGeneric();
		tg.testAdd();
		tg.testForEach();
		tg.testChild();
		tg.testForEach();
		tg.testBasicType();
	}

}
