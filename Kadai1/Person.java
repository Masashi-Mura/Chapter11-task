public class Person{
    //enumで性別を限定
    public enum Gender{MAN, WOMAN};
    private Gender gender;
    
    //インスタンスの生成時に性別を設定
    public Person(Gender gender){
        this.gender = gender;
    }

    //インスタンスメソッド speak
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