package com.kh.practice.func;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�, ����� �ƴϸ� ������� �ƴϴ١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num1 = sc.nextInt();
		System.out.println();
		System.out.println(num1>0?"�����":"����� �ƴϴ�");
		
	}
	
	public void practice2() {
		//Ű����� �Է� ���� �ϳ��� ������ ����̸� ������١�,
		//����� �ƴ� ��� �߿��� 0�̸� ��0�̴١�, 0�� �ƴϸ� �������١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num2 = sc.nextInt();
		System.out.println();
		System.out.println(num2>0?"�����":num2==0?"0�̴�":"������");

	}
	
	public void practice3() {
		//Ű����� �Է� ���� �ϳ��� ������ ¦���̸� ��¦���١�, ¦���� �ƴϸ� ��Ȧ���١��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num3 = sc.nextInt();
		System.out.println();
		System.out.println(num3%2==0?"¦����":"Ȧ����");
		
	}
	
	public void practice4() {
		//��� ����� ������ ���� ������������ �Ѵ�. �ο� ���� ���� ������ Ű����� �Է� �ް�
		//1�δ� �����ϰ� �������� ���� ������ �����ְ� ���� ������ ������ ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("�ο� �� : ");
		int people = sc.nextInt();
		System.out.print("���� ���� : ");
		int candy = sc.nextInt();
		System.out.println();
		System.out.println("1�δ� ���� ���� : "+candy/people);
		System.out.println("���� ���� ���� : "+candy%people);
		
	}
	
	public void practice5() {
		//Ű����� �Է� ���� ������ ������ ����ϰ� ����� ���� ���� ȭ�鿡 ����Ͽ� Ȯ���ϼ���.
		//�� �� ������ ��M���̸� ���л�, ��M���� �ƴϸ� ���л����� ��� ó�� �ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("�г�(���ڸ�) : ");
		int grade = sc.nextInt();
		System.out.print("��(���ڸ�) : ");
		int class0 = sc.nextInt();
		System.out.print("��ȣ(���ڸ�) : ");
		int num = sc.nextInt();
		System.out.print("����(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("����(�Ҽ��� �Ʒ� ��°�ڸ�����) : ");
		double result = sc.nextDouble();
		System.out.println();
		System.out.printf("%d�г� %d�� %d�� %s %s�л��� ������ %.2f�̴�.", grade, class0, num, name, gender=='M'?"��":"��", result);
		
	}
	
	public void practice6() {
		//���̸� Ű����� �Է� �޾� ���(13�� ����)����, û�ҳ�(13�� �ʰ� ~ 19�� ����)����,
		//����(19�� �ʰ�)���� ����ϼ���
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int age = sc.nextInt();
		System.out.println();
		System.out.println(age>20?"����":age<14?"���":"û�ҳ�");
		
	}
	
	public void practice7() {
//		����, ����, ���п� ���� ������ Ű���带 �̿��� ������ �Է� �ް�
//		�� ���� ���� �հ�(����+����+����)�� ���(�հ�/3.0)�� ���ϼ���.
//		�� ������ ������ ����� ������ �հ� ���θ� ó���ϴµ�
//		�� ���� ������ ���� 40�� �̻��̸鼭 ����� 60�� �̻��� �� �հ�, �ƴ϶�� ���հ��� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int korean = sc.nextInt();
		System.out.print("���� : ");
		int math = sc.nextInt();
		System.out.print("���� : ");
		int english = sc.nextInt();
		int all = korean + math + english;
		System.out.println();
		System.out.println("�հ� : "+all);
		System.out.println("��� : "+all/3.0);
		System.out.println(korean>=40&&math>=40&&english>=40&&all>=60?"�հ�":"���հ�");
		
	}
	
	public void practice8() {
		//�ֹι�ȣ�� �̿��Ͽ� �������� �������� �����Ͽ� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹι�ȣ�� �Է��ϼ���(- ����) : ");
		char rrnum = sc.next().charAt(7);
		System.out.println();
		System.out.println(rrnum=='2'?"����":"����");
		
	}
	
	public void practice9() {
//		Ű����� ���� �� ���� �Է� �޾� ���� ����(num1, num2)�� �����ϼ���.
//		�׸��� �� �ٸ� ������ �Է� �޾� �� ���� num1 ���ϰų� num2 �ʰ��̸� true�� ����ϰ�
//		�ƴϸ� false�� ����ϼ���. (��, num1�� num2���� �۾ƾ� ��)
		Scanner sc = new Scanner(System.in);
		System.out.print("����1 : ");
		int num1 = sc.nextInt();
		System.out.print("����2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է� : ");
		int num3 = sc.nextInt();
		System.out.println();
		System.out.println(num3<=num2||num3>num2?"true":"false");
		
	}
	
	public void practice10() {
		//3���� ���� Ű����� �Է� �޾� �Է� ���� ���� ��� ������ true, �ƴϸ� false�� ����ϼ���.
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�1 : ");
		int num1 = sc.nextInt();
		System.out.print("�Է�2 : ");
		int num2 = sc.nextInt();
		System.out.print("�Է�3 : ");
		int num3 = sc.nextInt();
		System.out.println();
		System.out.println((num1==num2)&&(num2==num3)&&(num1==num3)?"true":"false");
		
	}
	
	public void practice11() {
//		A, B, C ����� ������ �Է� �ް� �� ����� ������ �μ�Ƽ�긦 ������ ������ ����Ͽ� ����ϰ�
//		�μ�Ƽ�� ���� �޿��� 3000���� �̻��̸� ��3000 �̻�, �̸��̸� ��3000 �̸����� ����ϼ���.
//		(A ����� �μ�Ƽ��� 0.4, B ����� �μ�Ƽ��� ������, C ����� �μ�Ƽ��� 0.15)
		Scanner sc = new Scanner(System.in);
		System.out.print("A����� ���� : ");
		int amoney = sc.nextInt();
		System.out.print("B����� ���� : ");
		int bmoney = sc.nextInt();
		System.out.print("C����� ���� : ");
		int cmoney = sc.nextInt();
		System.out.println();
		System.out.println("A��� ����/����+a : "+amoney+"/"+amoney*1.4);
		System.out.println(amoney*1.4>3000?"3000 �̻�":"3000 �̸�");
		System.out.println("B��� ����/����+a : "+bmoney+"/"+bmoney*1.0);
		System.out.println(bmoney*1.0>3000?"3000 �̻�":"3000 �̸�");
		System.out.println("C��� ����/����+a : "+cmoney+"/"+cmoney*1.15);
		System.out.println(cmoney*1.15>3000?"3000 �̻�":"3000 �̸�");
		
	}

}
