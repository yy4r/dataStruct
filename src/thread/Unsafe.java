package thread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/2 14:20
 */
//ģ���̲߳���ȫ���
public class Unsafe {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i=1;i<=10000;i++){
          new Thread(()->{
                  list.add(Thread.currentThread().getName());
          }).start();
        }
        try {
            //���߳̿���ֱ��ִ�е�����  ������Խ����׼ȷ  �߳�����������
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }

}
