public class Humanwfather {//для задачи 2.2
    public Human father;
    public Human human;

    public Humanwfather(Human human, Human father) {
        this.father=father;
        this.human=human;
    }
    public String toString() {
        if(human.name.lastname==null&father.name.pname!=null){
            human.name.lastname=father.name.pname+"ович";
        }
        if (human.name.surname==null&father.name.surname!=null){
            human.name.surname=father.name.surname;
        }
        return human.toString();
    }
}

