import java.util.*;
class ListManager {
    public void addElement(List<Integer> list, int element) { list.add(element); }
    public void removeElement(List<Integer> list, int element) { list.remove(Integer.valueOf(element)); }
    public int getSize(List<Integer> list) { return list.size(); }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        ListManager lm = new ListManager();
        lm.addElement(list, 5);
        System.out.println(lm.getSize(list));
    }
}
