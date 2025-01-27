package kihons;

import framework.bases.ControlStructuresKihonBase;
import framework.exceptions.NotImplementedYetException;
import framework.Target;

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
        for(String string: list){
            a.hit();

        }
    }

    @Override
    protected void callHitOnAWhileAIsValidIsTrue(Target a) {
        while (a.isValid()){
            a.hit();
    }
    }

    @Override
    protected void nTimesCallHitOnA(int n, Target a) {
        for (int i = 0; i < n; i++) {
            a.hit();
        }
    }

    @Override
    protected void callHitOnAOnceAndLoopUntilIsValidIsFalse(Target a) {
       do{
           a.hit();
       } while (a.isValid());
    }
}
