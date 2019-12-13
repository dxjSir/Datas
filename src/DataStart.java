public class DataStart {
    public static void main(String[] args) {
        SeqList seqList = new SeqList(5);
        seqList.insert(0,1231);
        seqList.insert(1,111);
        seqList.insert(2,112);
        seqList.insert(3,121);
        seqList.insert(4,112);

        System.out.println(seqList.getSize());

        int length = seqList.getSize() ;
        while (length > 0) {
            length --;
            System.out.println( seqList.getData(length) );
        }


        LinkList linkList = new LinkList();

        linkList.insert(0,12);
        linkList.insert(1,111);
        linkList.insert(2,12);
        linkList.insert(3,12);

        linkList.delete(1);
        int i =0;
        System.out.println(linkList.size());
        while (!linkList.isEmpty() && i<linkList.size()) {
            System.out.println(linkList.getData(i));
            i++;
        }
    }
}
