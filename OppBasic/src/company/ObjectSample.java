package company;

public class ObjectSample {

    public static void main(String[] args) {
     //ここから変更   
     // インスタンスの作成
        var salesDepartment = new Department("営業部", "xx", 1000000);
        Employee sales = new Sales("鈴木", salesDepartment, "課長", 100);

        // インスタンスメソッドの呼び出し
        sales.report();
        sales.report(2);
        sales.joinMeeting();
        //変更ここまで
        
        // 1行空ける
        System.out.println("");

        // インスタンスの作成
        var devDepartment = new Department("開発部", "yy", 0);
        var engineer = new Engineer("田中", devDepartment, "一般社員", 88, "java");//変更

        // インスタンスメソッドの呼び出し
        engineer.report();
        engineer.joinMeeting();
        engineer.developSoftware();//追記
        
     // ----- 追記（ここから） -----
        // ポリモーフィズムの確認
        Employee projectManager = new Engineer("佐藤", devDepartment, "PM", 99, "Java");

        // インスタンスメソッドの呼び出し
        projectManager.report();
        projectManager.joinMeeting();
        if (projectManager instanceof Engineer) {
            // developSoftwareメソッドを呼び出す
            ((Engineer) projectManager).developSoftware();
         // ----- 追記（ここから） -----
            
            // 1行空ける
            System.out.println("");

            // アルバイトインスタンスの作成
            var parttimeWorker = new ParttimeWorker("太田", salesDepartment);//変更
            
            // 実装したメソッドの呼び出し
            ((Workable) sales).work();//変更
            ((Workable) engineer).work();
            ((Workable) projectManager).work();
            ((Workable) parttimeWorker).work();
            // ----- 追記（ここまで） -----
        }
        
    }

}
