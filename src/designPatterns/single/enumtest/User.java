package designPatterns.single.enumtest;

/**
 * @author Jack
 * @version 1.0
 * @date 2020/6/1 20:00
 */

public class User {
    //˽�л����캯��
    private User(){ }

    //����һ����̬ö����
    static enum SingletonEnum{
        //����һ��ö�ٶ��󣬸ö�������Ϊ����
        INSTANCE;
        private User user;
        //˽�л�ö�ٵĹ��캯��
        private SingletonEnum(){
            user=new User();
        }
        public User getInstnce(){
            return user;
        }
    }

    //���Ⱪ¶һ����ȡUser����ľ�̬����
    public static User getInstance(){
        return SingletonEnum.INSTANCE.getInstnce();
    }
}


