package annotation.basic;

@AnnoMeta
public class MetaData {
//    @AnnoMeta
    private String id;

    @AnnoMeta
    public void call() {
    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnoMeta TypeAnno=MetaData.class.getAnnotation(AnnoMeta.class);
        System.out.println("TypeAnno = " + TypeAnno);

        AnnoMeta methodAnno=MetaData.class.getMethod("call").getAnnotation(AnnoMeta.class);
        System.out.println("methodAnno = " + methodAnno);
    }
}
