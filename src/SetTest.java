import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SetTest {

	public List<Course>coursesToSelect;
	private Scanner console;
	
	public Student student;
	
	public SetTest(){
		coursesToSelect = new ArrayList<Course>();
		console = new Scanner(System.in);
	}
	
	public void testAdd(){
		//����һ���γ̶��󣬲�ͨ������add()��������ӱ�ѡ�γ�List��
		Course crl = new Course("1","���ݽṹ");
		coursesToSelect.add(crl);
		Course temp= (Course)coursesToSelect.get(0);
		//System.out.println("����˿γ�: " + temp.id + ":" + temp.name);
		
		
		Course cr2 = new Course("2","C����");
		coursesToSelect.add(0,cr2);
		Course temp2 = (Course)coursesToSelect.get(0);
		//System.out.println("����˿γ�:" + temp2.id + ":" + temp2.name);
		
		
//		coursesToSelect.add(crl);
//		Course temp0 = (Course)coursesToSelect.get(2);
//		System.out.println("����˿γ�: " + temp0.id + ":" + temp0.name);
		
		//���·������׳������±�Խ���쳣
//		Course cr3 = new Course("3","test");
//		coursesToSelect.add(3,cr3);
//		Course temp3 = (Course)coursesToSelect.get(0);
//		System.out.println("����˿γ�:" + temp3.id + ":" + temp3.name);
		
		Course[] course = {new Course("3","��ɢ��ѧ"),new Course("4","�������")};
		coursesToSelect.addAll(Arrays.asList(course));
		Course temp3 = (Course)coursesToSelect.get(2);
		Course temp4 = (Course)coursesToSelect.get(3);
		//System.out.println("������ſγ̣� " + temp3.id + temp3.name + "  " +
		//temp4.id + temp4.name);
		
		Course[] course2 = {new Course("5","�ߵ���ѧ"),new Course("6","��ѧӢ��")};
		coursesToSelect.addAll(2,Arrays.asList(course2));
		Course temp5= (Course)coursesToSelect.get(2);
		Course temp6 = (Course)coursesToSelect.get(3);
		//System.out.println("������ſγ̣� " + temp5.id + temp5.name + "  " +
		//temp6.id + temp6.name);
	}
	
	/**
	 * ����List�е�contains����
	 */
	public void testListContains(){
		Course course = coursesToSelect.get(0);
		//��ӡ���courseToSelect�Ƿ����course����
		System.out.println("ȡ�ÿγ̣�" + course.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course.name + "," + 
		coursesToSelect.contains(course));
		//��ʾ����γ�����
		System.out.println("������γ�����");
		String name = console.next();
		
		//�����µĿγ̶���ID������
		Course course2  = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�" + course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + 
		course2.name + "," + coursesToSelect.contains(course2));
		//�������course2��������λ��
		if(coursesToSelect.contains(course2))
			System.out.println("�γ̣�" + course2.name + "������λΪ��" +
								coursesToSelect.indexOf(course2));
	}
	public void testForEach(){
		System.out.println("�����¿γ�(ͨ��for each����)��");
		for(Object obj: coursesToSelect){
			Course cr = (Course)obj;
			System.out.println("�γ̣� " + cr.id +":" + cr.name);
			
			
		}
	}
	
	public void testForEachSet(Student student){
		//��ӡ���ѧ����ѡ�Ŀγ�
		System.out.println("��ѡ����:" + student.courses.size() + "�ſγ�");
				for(Course cr:student.courses){
					System.out.println("ѡ���˿γ�:" + cr.id + ":" + cr.name);
				}
	}
	/**
	 * ����Set��contains����
	 */

	//����ѧ������ѡ��
	public void createStudentAndSelectCourse(){
		//����һ��ѧ������
		student = new Student("1","С��");
		System.out.println("��ӭѧ��" + student.name + "ѡ��");
		//����һ��Scanner �����������մӼ�������Ŀγ�D
		Scanner console = new Scanner(System.in);
		
		for(int i = 0;i < 3;i ++){
			System.out.println("������γ�ID");
			String courseId = console.next();
			for(Course cr: coursesToSelect){
				if(cr.id.equals(courseId)){
					student.courses.add(cr);
					
					/**
					 *Set �����ĳ������������Ӷ��ٴ�
					 *����ֻ�ᱣ����һ����ӵĶ���
					 **/
					//student.courses.add(cr);
				}
			}
		}	
	}
	public void testSetContains(){
		//��ʾ����γ�����
		System.out.println("������ѧ����ѡ�Ŀγ�����:");
		String name = console.next();
		//����һ���µĿγ̶���ID�����ƣ�����course������ȫһ��
		Course course2  = new Course();
		course2.name = name;
		System.out.println("�´����γ̣�" + course2.name);
		System.out.println("��ѡ�γ����Ƿ�����γ̣�" + course2.name + "," +
		student.courses.contains(course2));

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest st = new SetTest();
		st.testAdd();
		st.testListContains();
		st.testForEach();
//		st.createStudentAndSelectCourse();
//		st.testSetContains();

//		st.testForEach();
	}

}
