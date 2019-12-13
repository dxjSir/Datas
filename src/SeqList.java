import java.util.List;

public class SeqList {
    final int defaultSize = 10 ;

    int maxSize ;
    int size;
    Object[] listArray;

    SeqList() {
        initiate(defaultSize);
    }

    SeqList(int sz) {
        initiate(sz);
    }

    public void initiate(int sz) {
        maxSize = sz;
        size = 0;
        listArray = new Object[sz] ;
    }

    public void insert(int i,Object object) {
        if (size == maxSize) {
            System.out.println("表已满");
        }

        if (i < 0 || i >size) {
            System.out.println("参数错误");
        }

        for (int j = size ; j > i; j--) {
            listArray[j] = listArray[j-1];
        }

        listArray[i] = object;
        size ++;
    }

    public Object delete(int i) throws Exception {
        if (size == 0) {
            System.out.println("表空");
        }
        if (i < 0 || i>size-1) {
            System.out.println("参数错误");
        }
        Object it = listArray[i];

        for (int j = i;j<size -1 ;j++) {
            listArray[j] = listArray[j+1];
        }
        size -- ;
        return it;
    }

    public Object getData(int i) {
        if (i <0 || i>size -1) {
            System.out.println("参数错误");
        }

        return listArray[i];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
