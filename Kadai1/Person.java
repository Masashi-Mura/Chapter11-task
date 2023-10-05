public class Person{
    //enum�Ő��ʂ�����
    public enum Gender{
        MAN("man"), WOMAN("woman");
        //enum�̃t�B�[���h�̒�`
        private String speakGender;
        //enum�̃R���X�g���N�^�̒�`
        private Gender(String speakGender){
            this.speakGender = speakGender;
        }
    }
    private Gender gender;
    
    //�C���X�^���X�̐������ɐ��ʂ�ݒ�
    public Person(Gender gender){
        this.gender = gender;
    }

    //�C���X�^���X���\�b�h speak
    public void speak(){
        // switch(gender){
        //     case MAN:
        //         System.out.println("I'm a man");
        //         break;
        //     case WOMAN:
        //         System.out.println("I'm a woman");
        //         break;
        //     default:
        // }
        //��Lswitch����񋓌^Gender�̃t�B�[���h�ɕύX
        System.out.println("I'm a "+ gender.speakGender);

    }

    public static void main(String[] args){
        Person man = new Person(Gender.MAN);
        Person woman = new Person(Gender.WOMAN);
        man.speak();
        woman.speak();
    }
}