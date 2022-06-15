//package com;
//import java.io.IOException;
//import java.util.List;
//import org.apache.zookeeper.AsyncCallback.StringCallback;
//import org.apache.zookeeper.CreateMode;
//import org.apache.zookeeper.KeeperException;
//import org.apache.zookeeper.WatchedEvent;
//import org.apache.zookeeper.Watcher;
//import org.apache.zookeeper.Watcher.Event.EventType;
//import org.apache.zookeeper.Watcher.Event.KeeperState;
//import org.apache.zookeeper.ZooDefs.Ids;
//import org.apache.zookeeper.ZooKeeper;
//
// public class BaseZookeeper{
//
//     public static void main(String[] args) {
//         String connectString = "114.116.242.28:2181";
//         int sessionTimeout = 500000;  // 会话时间。设置长一点，如果不够长，则会connect loss
//         try {
//             // 建立zookeeper链接
//             ZooKeeper zk = new ZooKeeper(connectString, sessionTimeout, new Watcher(){
//                 public void process(WatchedEvent event) {
//                     // 监控所有触发的事件
//                     System.out.println("start do something");
//                     Event.EventType type = event.getType();        // 事件类型。枚举
//                     KeeperState state = event.getState();    // 状态。 枚举
////                    type.getIntValue();
//                     switch (type) {
//                         case None:  // int值对应 -1
//                             System.out.println("none 事件触发");
//                             break;
//                         case NodeCreated:  // int值对应 1
//                             System.out.println("创建节点事件发生了");
//                             break;
//                         case NodeDeleted:  // int值对应 2
//                             System.out.println("删除节点事件发生了");
//                             break;
//                         case NodeDataChanged:  // int值对应 3
//                             System.out.println("节点数据改变事件发生了");
//                             break;
//                         case NodeChildrenChanged:  // int值对应 4
//                             System.out.println("子节点改变事件发生了");
//                             break;
//                         default:
//                             System.out.println("I do not know what operate you do");
//                             break;
//                     }
////                    state.getIntValue();  NoSyncConnected 1和Unknown-1
//                     switch (state) {
//                         case Disconnected:  // 0
//                             System.out.println("失去连接");
//                             break;
//                         case SyncConnected:  // 3
//                             System.out.println("异步链接");
//                             break;
//                         case Expired:  // -112
//                             System.out.println("超时过期");
//                             break;
//                         default:
//                             break;
//                     }
//
//                     System.out.println("end");
//                 }
//             });
//             List<String> list = zk.getChildren("/", true); // 获取所有节点
//             if(list != null) {
//                 for(String s : list)
//                     System.out.println(s);
//             }
//             // 在/app5节点下创建child节点
//             zk.create("/app5/child", "/app5的子节点数据".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT); // 会对数据持久化，服务下次启动任然存在
//             zk.create("/app6/child", "/app6的子节点数据".getBytes(), Ids.OPEN_ACL_UNSAFE,
//                     CreateMode.PERSISTENT, new StringCallback(){
//                         @Override
//                         public void processResult(int rc, String path, Object ctx, String name) {
//                             System.out.println("rc: " + rc);
//                             System.out.println("path: " + path);
//                             System.out.println("Object:" + ctx);
//                             System.out.println("name: " + name);
//                         }
//                     }, "ctx object");
//
//         } catch (IOException e) {
//             e.printStackTrace();
//         } catch (KeeperException e) {
//             e.printStackTrace();
//         } catch (InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }
