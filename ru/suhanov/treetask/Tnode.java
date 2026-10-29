package ru.suhanov.treetask;
import java.util.ArrayList;

public class Tnode {
    int value=0;
    Tnode prev;
    Tnode leftnext;
    Tnode rightnext;

    public void addval(int val){
        if (this.value==0){
        this.value=val;
        }
        else{

        if (val>this.value){
            if (this.rightnext==null){
            this.rightnext=new Tnode();
            this.rightnext.value=val;
            this.rightnext.prev=this;
            }
            else{
                this.rightnext.addval(val);
            }

        }
        else{
            if (this.leftnext==null){
                this.leftnext=new Tnode();
                this.leftnext.value=val;
                this.leftnext.prev=this;
            }
            else{
                this.leftnext.addval(val);
            }
        }

        }
    }

    private int findMin(){
        if (leftnext == null){
            return value;
        }
        return leftnext.findMin();
    }

    public Tnode delval(int val){
        if (this==null){
            return null;
        }

        if (val < this.value) {
            this.leftnext=this.leftnext.delval(val);
        }
        else if (val > this.value) {
            this.rightnext=this.rightnext.delval(val);
        }
        else {
            if (this.leftnext == null){
                return this.rightnext;
            }
            if (this.rightnext == null){
                return this.leftnext;
            }
            this.value = this.rightnext.findMin();
            this.rightnext = this.rightnext.delval(this.value);
        }
        return this;
    }

    public boolean has(int val){
        if(this.value==val){
            return true;
        }
        else{
            if (val < this.value && this.leftnext != null) {
                return this.leftnext.has(val);
            } else if (val > this.value && this.rightnext != null) {
                return this.rightnext.has(val);
            }
            return false;
        }
    }

    private void collectValues(ArrayList<Integer> list) {
        if (this.leftnext != null) {
            this.leftnext.collectValues(list);
        }

        list.add(this.value);

        if (this.rightnext != null) {
            this.rightnext.collectValues(list);
        }
    }

    public String toString() {
        ArrayList<Integer> values = new ArrayList<Integer>();
        collectValues(values);
        return values.toString();
    }

}
