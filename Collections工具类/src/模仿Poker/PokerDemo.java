package ģ��Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/*
 * ˼·��
 * 		A:����һ��HashMap����
 * 		B:����һ��ArrayList����
 * 		C:������ɫ����͵�������
 * 		D:��0��ʼ��HashMap����洢��ţ����洢��Ӧ����
 *        ͬʱ��ArrayList����洢��ż��ɡ�
 *      E:ϴ��(ϴ���Ǳ��)
 *      F:����(����Ҳ�Ǳ�ţ�Ϊ�˱�֤���������ģ��ʹ���TreeSet���Ͻ���)
 *      G:����(����TreeSet���ϣ���ȡ��ţ���HashMap�����Ҷ�Ӧ����)
 */

/*
* HashMap:�ѱ�ź��ƶ����ȥ�������ڿ��Ƶ�ʱ�򣬿��Ը��ݱ�ţ�ȡ���ơ�
* ArrayList�������š�Ϊ��ϴ�ơ�
* TreeSet�����ơ������Ǳ�ţ�������ġ�
* �ڿ��Ƶ�ʱ�򣬾Ϳ��Ը���TreeSet�ı�ţ���HashMap�л�ȡ�Ƶ�ֵ�ģ��������ƾ���������ˡ�
*
*
* */
public class PokerDemo {
	public static void main(String[] args) {
		// ����һ��HashMap����
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// ����һ��ArrayList����
		ArrayList<Integer> array = new ArrayList<Integer>();

		// ������ɫ����͵�������
		// ����һ����ɫ����
		String[] colors = { "?", "?", "?", "?" };
		// ����һ����������
		String[] numbers = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
				"K", "A", "2", };

		// ��0��ʼ��HashMap����洢��ţ����洢��Ӧ����,ͬʱ��ArrayList����洢��ż��ɡ�
		int index = 0;

		for (String number : numbers) {
			for (String color : colors) {
				String poker = color.concat(number);
				hm.put(index, poker);
				array.add(index);
				index++;
			}
		}
		hm.put(index, "С��");
		array.add(index);
		index++;
		hm.put(index, "����");
		array.add(index);

		// ϴ��(ϴ���Ǳ��)
		Collections.shuffle(array);

		// ����(����Ҳ�Ǳ�ţ�Ϊ�˱�֤���������ģ��ʹ���TreeSet���Ͻ���)
		TreeSet<Integer> fengQingYang = new TreeSet<Integer>();
		TreeSet<Integer> linQingXia = new TreeSet<Integer>();
		TreeSet<Integer> liuYi = new TreeSet<Integer>();
		TreeSet<Integer> diPai = new TreeSet<Integer>();

		for (int x = 0; x < array.size(); x++) {
			if (x >= array.size() - 3) {
				diPai.add(array.get(x));
			} else if (x % 3 == 0) {
				fengQingYang.add(array.get(x));
			} else if (x % 3 == 1) {
				linQingXia.add(array.get(x));
			} else if (x % 3 == 2) {
				liuYi.add(array.get(x));
			}
		}

		// ����(����TreeSet���ϣ���ȡ��ţ���HashMap�����Ҷ�Ӧ����)
		lookPoker("������", fengQingYang, hm);
		lookPoker("����ϼ", linQingXia, hm);
		lookPoker("����", liuYi, hm);
		lookPoker("����", diPai, hm);
	}

	// д���ƵĹ���
	public static void lookPoker(String name, TreeSet<Integer> ts,
			HashMap<Integer, String> hm) {
		System.out.print(name + "�����ǣ�");
		for (Integer key : ts) {
			String value = hm.get(key);
			System.out.print(value + " ");
		}
		System.out.println();
	}
}
