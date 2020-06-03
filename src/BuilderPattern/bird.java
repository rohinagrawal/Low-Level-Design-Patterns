package BuilderPattern;

public class bird {
    String name;
    int weight;
    int height;
    String color;
    public bird(builder x){
        this.name =x.name;
        this.weight =x.weight;
        this.height =x.height;
        this.color=x.color;
    }
    public static class builder{
        String name;
        int weight;
        int height;
        String color;
        public builder builder(String color){
//            For permanent/Mandatory Variables pass those in the constructor
            this.color=color;
            return this;
        }
        public builder setName(String name){
            this.name=name;
            return this;
        }
        public builder setweight(int weight){
            this.weight=weight;
            return this;
        }
        public builder setheight(int height){
            this.height=height;
            return this;
        }
//        public builder setcolor(String color){
//            this.color=color;
//            return this;
//        }
        public bird build(){
            return new bird(this);
        }
    }
}
