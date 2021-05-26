package rock.tool;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListTool {

    /**
     * 功能描述:(Set 集合分批切割)
     *
     * @param li
     * @param pageSize 分页大小
     * @param <T>
     * @return
     */
    public static <T> List<Set<T>> splitList(Set<T> li, int pageSize) {
        List<T> list = new ArrayList<>(li);
        int listSize = list.size();
        int page = (listSize + (pageSize - 1)) / pageSize;
        List<Set<T>> listArray = new ArrayList<Set<T>>();
        for (int i = 0; i < page; i++) {
            Set<T> subList = new HashSet<>();
            for (int j = 0; j < listSize; j++) {
                int pageIndex = ((j + 1) + (pageSize - 1)) / pageSize;
                if (pageIndex == (i + 1)) {
                    subList.add(list.get(j));
                }
                if ((j + 1) == ((j + 1) * pageSize)) {
                    break;
                }
            }
            listArray.add(subList);
        }
        return listArray;
    }
}
