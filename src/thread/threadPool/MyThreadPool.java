package thread.threadPool;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/4 10:25
 */
/*
�Զ����̳߳�
    ��Ա������
        �������  ��Ҫ�����̰߳�ȫ����
        ��ǰ�߳�����
        �����߳�����
        ����߳�����
        ������еĳ���
    ��Ա����
        �ύ����
            ��������ӵ������У��ж������Ƿ񳬳������ܳ���
        ִ������
            �жϵ�ǰ�̵߳��������������������̻߳��ǷǺ����߳�
* */
public class MyThreadPool {
    //�������  �̰߳�ȫ
    private List<Runnable> tasks = Collections.synchronizedList(new LinkedList<>());
    //��ǰ�߳�����
    private int num;
    //�����߳�����
    private int corePoolSize;
    //����߳�����
    private int maxSize;
    //������еĳ���
    private int workSize;

}















