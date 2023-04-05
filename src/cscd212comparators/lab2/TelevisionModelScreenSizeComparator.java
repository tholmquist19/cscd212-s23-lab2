package cscd212comparators.lab2;
import cscd212classes.lab2.Television;
import java.util.Comparator;

public class TelevisionModelScreenSizeComparator implements Comparator<Television>{
    @Override
    public int compare(Television t1, Television t2) {
        if (t1.getModel() == t2.getModel())
            return Integer.compare(t1.getScreenSize(), t2.getScreenSize());
        return CharSequence.compare(t1.getModel(), t2.getModel());
    }
}
