# CatchCrazyCat
围住神经猫游戏
实现思路笔记

1、创建工程

2、采用surfaceView对游戏界面进行绘制

3、自定义View继承surfaceView

4、getHolder().lockCanvas()进行重新绘制界面

5、拿到Canvas对界面进行处理

6、使用CallBack对象展示surfaceView

//完成第一步---界面预处理操作

7、创建一个实体类，存储坐标，状态

8、创建游戏元素

9、使用二维数组存储点坐标

10、双重for循环添加数据

11、游戏初始化，使所有坐标可用

12、游戏中的猫可看做是图中的一个点

13、随机设置路障

14、注意处理路障

15、注意行对列取余，列对行取余

//完成第二步，创建完所有的游戏元素

16、场景绘制

17、拿到画笔，对点进行绘色

18、对界面错位进行处理

19、打开画笔的抗锯齿

//完成第三步，完成场景

20、触摸事件处理

21、对事件进行拆分处理

22、将屏幕的坐标转化到当前游戏的坐标

23、避免数组越界，要对坐标进行保护处理

//完成第四部，点击事件处理

功能函数的实现

24、判断边界点	

25、获取相邻点

26、获取可行最短路径

27、猫可移动的距离

//完成第五步，逻辑功能函数处理

基本移动策略

28、猫自行移动的方法

29、打游戏失败

30、打游戏过关

//完成第六步，实现游戏可玩

逻辑算法优化

31、采用随机数，进行方向的选定		

32、采用最短路径优先算法			

33、注意数组越界问题
