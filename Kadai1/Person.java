public class Person{
    //enum�Ő��ʂ�����
    public enum Gender{MAN, WOMAN};
    private Gender gender;
    
    //�C���X�^���X�̐������ɐ��ʂ�ݒ�
    public Person(Gender gender){
        this.gender = gender;
    }

    //�C���X�^���X���\�b�h speak
    public void speak(){
        switch(gender){
            case MAN:
                System.out.println("I'm a man");
                break;
            case WOMAN:
                System.out.println("I'm a woman");
                break;
            default:
        }
    }

    public static void main(String[] args){
        Person man = new Person(Gender.MAN);
        Person woman = new Person(Gender.WOMAN);
        man.speak();
        woman.speak();
    }
}