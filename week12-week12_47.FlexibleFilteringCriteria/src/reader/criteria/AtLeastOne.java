package reader.criteria;

import java.util.ArrayList;
import java.util.List;

public class AtLeastOne implements Criterion{
    private List<Criterion>conditions;
    public AtLeastOne(Criterion... criteria) {
        conditions=new ArrayList<Criterion>();
        for(int i=0;i<criteria.length;i++){
            conditions.add(criteria[i]);
        }
    }

    @Override
    public boolean complies(String line) {
       for(Criterion criterion:conditions){
           if(criterion.complies(line)){
               return true;
           }
       }
       return false;
    }
}
