package thread;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 13:48
 */
//�ػ��߳� / �û��߳�
public class DeamonThread {
    public static void main(String[] args) {
        people people = new people();
        god god = new god();
        Thread thread1 = new Thread(people);
        Thread thread2 = new Thread(god);
        //����Ϊ�ػ��߳�
        thread2.setDaemon(true);
        thread1.start();
        thread2.start();
    }
}

class people implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("��" + i + "��");
        }
        System.out.println("-----------");
    }
}

/**
 * �������õ� �ϵ� ����Զ��ֹͣ�� true ����Ϊ�ػ��߳�֮�󣬿��Կ���Ч��
 */
class god implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("�ػ��ػ�");
        }
    }
}