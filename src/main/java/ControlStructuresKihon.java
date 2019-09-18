import framework.ControlStructuresKihonBase;
import framework.Target;

//package framework;
//
//public interface Target {
//    void hit();
//
//    boolean getIsValid();
//}

import java.util.Collection;

public class ControlStructuresKihon extends ControlStructuresKihonBase {
    @Override
    protected void callHitOnAIfValIsTrueElseCallHitOnB(boolean val, Target a, Target b) {
        if (val) {
            a.hit();
        }
        else {
            b.hit();
        }

    }

    @Override
    protected void callHitOnAOnceForEachMemberOfList(Target a, Collection<String> list) {
      /* int size = list.size();
       for (int i=0; i < size; i++){
        a.hit();
        }*/
      for (String b: list){
          a.hit();
      }


    }

    @Override
    protected void callHitOnAWhileAIsValidIsTrue(Target a) {
       while (a.getIsValid()){
           a.hit();
       }
    }

    @Override
    protected void nTimesCallHitOnA(int n, Target a) {
        /*int count = 0;
        while (count < n - 1) {
            a.hit();
            count++;
        }*/

        for (int i = 0; i < n; i++){
            a.hit();
         }
    }

    @Override
    protected void callHitOnAOnceAndLoopUntilIsValidIsFalse(Target a) {
       do {
               a.hit();
       } while (a.getIsValid());
    }
}
