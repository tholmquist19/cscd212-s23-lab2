package cscd212comparators.lab2;
import cscd212classes.lab2.Television;
import java.util.Comparator;

public class TelevisionResolutionMakeDescendingComparator implements Comparator<Television>{
    @Override
    public int compare(Television t1, Television t2) {
        if(t1.getResolution() == t2.getResolution())
            return CharSequence.compare(t1.getMake(), t2.getMake());
        return Integer.compare(t1.getResolution(), t2.getResolution());
    }
}
