
Thread dump during hang
-----------------------

```
2013-12-10 14:14:31
Full thread dump Java HotSpot(TM) 64-Bit Server VM (23.7-b01 mixed mode):

"run-main" prio=5 tid=0x00007fce194c9000 nid=0x6803 runnable [0x000000011130f000]
   java.lang.Thread.State: RUNNABLE
	at scala.collection.mutable.HashTable$class.scala$collection$mutable$HashTable$$findEntry0(HashTable.scala:133)
	at scala.collection.mutable.HashTable$class.findOrAddEntry(HashTable.scala:162)
	at scala.collection.mutable.HashMap.findOrAddEntry(HashMap.scala:39)
	at scala.collection.mutable.HashMap.$plus$eq(HashMap.scala:89)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$typeFlowLattice$$anonfun$lub2$3.apply(TypeFlowAnalysis.scala:83)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$typeFlowLattice$$anonfun$lub2$3.apply(TypeFlowAnalysis.scala:82)
	at scala.collection.mutable.HashMap$$anonfun$foreach$1.apply(HashMap.scala:98)
	at scala.collection.mutable.HashMap$$anonfun$foreach$1.apply(HashMap.scala:98)
	at scala.collection.mutable.HashTable$class.foreachEntry(HashTable.scala:226)
	at scala.collection.mutable.HashMap.foreachEntry(HashMap.scala:39)
	at scala.collection.mutable.HashMap.foreach(HashMap.scala:98)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$typeFlowLattice$.lub2(TypeFlowAnalysis.scala:82)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$typeFlowLattice$.lub2(TypeFlowAnalysis.scala:70)
	at scala.tools.nsc.backend.icode.analysis.SemiLattice$$anonfun$lub$1.apply(SemiLattice.scala:47)
	at scala.collection.LinearSeqOptimized$class.foldLeft(LinearSeqOptimized.scala:111)
	at scala.collection.immutable.List.foldLeft(List.scala:84)
	at scala.collection.LinearSeqOptimized$class.reduceLeft(LinearSeqOptimized.scala:125)
	at scala.collection.immutable.List.reduceLeft(List.scala:84)
	at scala.tools.nsc.backend.icode.analysis.SemiLattice$class.lub(SemiLattice.scala:47)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$MTFAGrowable.forwardAnalysis(TypeFlowAnalysis.scala:737)
	at scala.tools.nsc.backend.icode.analysis.TypeFlowAnalysis$MTFAGrowable.run(TypeFlowAnalysis.scala:391)
	at scala.tools.nsc.backend.opt.Inliners$Inliner.analyzeMethod(Inliners.scala:501)
	at scala.tools.nsc.backend.opt.Inliners$Inliner.analyzeClass(Inliners.scala:271)
	at scala.tools.nsc.backend.opt.Inliners$InliningPhase$$anonfun$run$1.apply(Inliners.scala:136)
	at scala.tools.nsc.backend.opt.Inliners$InliningPhase$$anonfun$run$1.apply(Inliners.scala:136)
	at scala.collection.Iterator$class.foreach(Iterator.scala:727)
	at scala.collection.AbstractIterator.foreach(Iterator.scala:1157)
	at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
	at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
	at scala.tools.nsc.backend.opt.Inliners$InliningPhase.run(Inliners.scala:136)
	at scala.tools.nsc.Global$Run.compileUnitsInternal(Global.scala:1583)
	at scala.tools.nsc.Global$Run.compileUnits(Global.scala:1557)
	at scala.tools.nsc.Global$Run.compileSources(Global.scala:1553)
	at scala.tools.nsc.interpreter.IMain.compileSourcesKeepingRun(IMain.scala:428)
	at scala.tools.nsc.interpreter.IMain$ReadEvalPrint.compileAndSaveRun(IMain.scala:801)
	at scala.tools.nsc.interpreter.IMain$ReadEvalPrint.compile(IMain.scala:761)
	at scala.tools.nsc.interpreter.IMain$Request.compile$lzycompute(IMain.scala:936)
	- locked <0x00000007cd1c5778> (a scala.tools.nsc.interpreter.IMain$Request)
	at scala.tools.nsc.interpreter.IMain$Request.compile(IMain.scala:931)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:603)
	at scala.tools.nsc.interpreter.IMain.interpret(IMain.scala:568)
	at scala.tools.nsc.interpreter.ILoop.reallyInterpret$1(ILoop.scala:756)
	at scala.tools.nsc.interpreter.ILoop.interpretStartingWith(ILoop.scala:801)
	at scala.tools.nsc.interpreter.ILoop.command(ILoop.scala:713)
	at scala.tools.nsc.interpreter.ILoop.processLine$1(ILoop.scala:577)
	at scala.tools.nsc.interpreter.ILoop.innerLoop$1(ILoop.scala:584)
	at scala.tools.nsc.interpreter.ILoop.loop(ILoop.scala:587)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply$mcZ$sp(ILoop.scala:878)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply(ILoop.scala:833)
	at scala.tools.nsc.interpreter.ILoop$$anonfun$process$1.apply(ILoop.scala:833)
	at scala.tools.nsc.util.ScalaClassLoader$.savingContextLoader(ScalaClassLoader.scala:135)
	at scala.tools.nsc.interpreter.ILoop.process(ILoop.scala:833)
	at scala.tools.nsc.interpreter.ILoop.main(ILoop.scala:900)
	at xsbt.ConsoleInterface.run(ConsoleInterface.scala:69)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:601)
	at sbt.compiler.AnalyzingCompiler.call(AnalyzingCompiler.scala:102)
	at sbt.compiler.AnalyzingCompiler.console(AnalyzingCompiler.scala:77)
	at sbt.Console.sbt$Console$$console0$1(Console.scala:23)
	at sbt.Console$$anonfun$apply$2$$anonfun$apply$1.apply$mcV$sp(Console.scala:24)
	at sbt.TrapExit$.sbt$TrapExit$$executeMain$1(TrapExit.scala:33)
	at sbt.TrapExit$$anon$1.run(TrapExit.scala:42)

"pool-7-thread-5" prio=5 tid=0x00007fce1a4cf800 nid=0x6703 waiting on condition [0x000000011120e000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c573c5f8> (a java.util.concurrent.SynchronousQueue$TransferStack)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:226)
	at java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
	at java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:359)
	at java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:942)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1068)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"pool-7-thread-4" prio=5 tid=0x00007fce1980a800 nid=0x6603 waiting on condition [0x000000011110b000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c573c5f8> (a java.util.concurrent.SynchronousQueue$TransferStack)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:226)
	at java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
	at java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:359)
	at java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:942)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1068)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"pool-7-thread-3" prio=5 tid=0x00007fce1c020800 nid=0x6503 in Object.wait() [0x0000000111007000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x00000007cca86f68> (a sbt.TrapExit$$anon$1)
	at java.lang.Thread.join(Thread.java:1258)
	- locked <0x00000007cca86f68> (a sbt.TrapExit$$anon$1)
	at java.lang.Thread.join(Thread.java:1332)
	at sbt.TrapExit$.sbt$TrapExit$$waitOnThread(TrapExit.scala:88)
	at sbt.TrapExit$$anonfun$waitForExit$1.apply(TrapExit.scala:78)
	at sbt.TrapExit$$anonfun$waitForExit$1.apply(TrapExit.scala:74)
	at scala.collection.Iterator$class.foreach(Iterator.scala:727)
	at scala.collection.AbstractIterator.foreach(Iterator.scala:1157)
	at scala.collection.IterableLike$class.foreach(IterableLike.scala:72)
	at scala.collection.AbstractIterable.foreach(Iterable.scala:54)
	at sbt.TrapExit$.processThreads(TrapExit.scala:138)
	at sbt.TrapExit$.waitForExit(TrapExit.scala:74)
	at sbt.TrapExit$.apply(TrapExit.scala:53)
	at sbt.Run$.executeTrapExit(Run.scala:95)
	at sbt.Console$$anonfun$apply$2.apply(Console.scala:24)
	at sbt.Console$$anonfun$apply$2.apply(Console.scala:24)
	at sbt.JLine$$anonfun$withJLine$1.apply(LineReader.scala:118)
	at sbt.JLine$$anonfun$withJLine$1.apply(LineReader.scala:116)
	at sbt.JLine$.withTerminal(LineReader.scala:92)
	- locked <0x00000007c54f5020> (a jline.UnixTerminal)
	- locked <0x00000007c4ce4ec0> (a sbt.JLine$)
	at sbt.JLine$.withJLine(LineReader.scala:116)
	at sbt.Console.apply(Console.scala:24)
	at sbt.Console.apply(Console.scala:19)
	at sbt.Defaults$$anonfun$consoleTask$1.apply(Defaults.scala:704)
	at sbt.Defaults$$anonfun$consoleTask$1.apply(Defaults.scala:699)
	at scala.Function8$$anonfun$tupled$1.apply(Function8.scala:35)
	at scala.Function8$$anonfun$tupled$1.apply(Function8.scala:34)
	at scala.Function1$$anonfun$compose$1.apply(Function1.scala:47)
	at sbt.$tilde$greater$$anonfun$$u2219$1.apply(TypeFunctions.scala:42)
	at sbt.std.Transform$$anon$4.work(System.scala:64)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:237)
	at sbt.Execute$$anonfun$submit$1$$anonfun$apply$1.apply(Execute.scala:237)
	at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:18)
	at sbt.Execute.work(Execute.scala:244)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:237)
	at sbt.Execute$$anonfun$submit$1.apply(Execute.scala:237)
	at sbt.ConcurrentRestrictions$$anon$4$$anonfun$1.apply(ConcurrentRestrictions.scala:160)
	at sbt.CompletionService$$anon$2.call(CompletionService.scala:30)
	at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
	at java.util.concurrent.FutureTask.run(FutureTask.java:166)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:471)
	at java.util.concurrent.FutureTask$Sync.innerRun(FutureTask.java:334)
	at java.util.concurrent.FutureTask.run(FutureTask.java:166)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1145)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"pool-7-thread-2" prio=5 tid=0x00007fce193c8800 nid=0x6403 waiting on condition [0x0000000110f05000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c573c5f8> (a java.util.concurrent.SynchronousQueue$TransferStack)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:226)
	at java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
	at java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:359)
	at java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:942)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1068)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"pool-7-thread-1" prio=5 tid=0x00007fce1b089000 nid=0x6303 waiting on condition [0x0000000110bf3000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c573c5f8> (a java.util.concurrent.SynchronousQueue$TransferStack)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:226)
	at java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
	at java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:359)
	at java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:942)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1068)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"process reaper" daemon prio=5 tid=0x00007fce199cc800 nid=0x4403 waiting on condition [0x0000000110d90000]
   java.lang.Thread.State: TIMED_WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c4ce1940> (a java.util.concurrent.SynchronousQueue$TransferStack)
	at java.util.concurrent.locks.LockSupport.parkNanos(LockSupport.java:226)
	at java.util.concurrent.SynchronousQueue$TransferStack.awaitFulfill(SynchronousQueue.java:460)
	at java.util.concurrent.SynchronousQueue$TransferStack.transfer(SynchronousQueue.java:359)
	at java.util.concurrent.SynchronousQueue.poll(SynchronousQueue.java:942)
	at java.util.concurrent.ThreadPoolExecutor.getTask(ThreadPoolExecutor.java:1068)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:615)
	at java.lang.Thread.run(Thread.java:722)

"Service Thread" daemon prio=5 tid=0x00007fce190c7800 nid=0x4203 runnable [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread1" daemon prio=5 tid=0x00007fce190c6800 nid=0x4103 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"C2 CompilerThread0" daemon prio=5 tid=0x00007fce190c6000 nid=0x4003 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Signal Dispatcher" daemon prio=5 tid=0x00007fce190c5000 nid=0x3f03 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Surrogate Locker Thread (Concurrent GC)" daemon prio=5 tid=0x00007fce1982d800 nid=0x3d23 waiting on condition [0x0000000000000000]
   java.lang.Thread.State: RUNNABLE

"Finalizer" daemon prio=5 tid=0x00007fce1880d000 nid=0x2b03 in Object.wait() [0x000000010fd1a000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x00000007c4ce17a8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:135)
	- locked <0x00000007c4ce17a8> (a java.lang.ref.ReferenceQueue$Lock)
	at java.lang.ref.ReferenceQueue.remove(ReferenceQueue.java:151)
	at java.lang.ref.Finalizer$FinalizerThread.run(Finalizer.java:177)

"Reference Handler" daemon prio=5 tid=0x00007fce19810000 nid=0x2a03 in Object.wait() [0x000000010fc17000]
   java.lang.Thread.State: WAITING (on object monitor)
	at java.lang.Object.wait(Native Method)
	- waiting on <0x00000007c4ce39a8> (a java.lang.ref.Reference$Lock)
	at java.lang.Object.wait(Object.java:503)
	at java.lang.ref.Reference$ReferenceHandler.run(Reference.java:133)
	- locked <0x00000007c4ce39a8> (a java.lang.ref.Reference$Lock)

"main" prio=5 tid=0x00007fce19801000 nid=0x1703 waiting on condition [0x0000000107da6000]
   java.lang.Thread.State: WAITING (parking)
	at sun.misc.Unsafe.park(Native Method)
	- parking to wait for  <0x00000007c58599e8> (a java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject)
	at java.util.concurrent.locks.LockSupport.park(LockSupport.java:186)
	at java.util.concurrent.locks.AbstractQueuedSynchronizer$ConditionObject.await(AbstractQueuedSynchronizer.java:2043)
	at java.util.concurrent.LinkedBlockingQueue.take(LinkedBlockingQueue.java:442)
	at java.util.concurrent.ExecutorCompletionService.take(ExecutorCompletionService.java:193)
	at sbt.ConcurrentRestrictions$$anon$4.take(ConcurrentRestrictions.scala:196)
	at sbt.Execute.next$1(Execute.scala:88)
	at sbt.Execute.processAll(Execute.scala:91)
	at sbt.Execute.runKeep(Execute.scala:69)
	at sbt.EvaluateTask$.liftedTree1$1(EvaluateTask.scala:183)
	at sbt.EvaluateTask$.sbt$EvaluateTask$$run$1(EvaluateTask.scala:183)
	at sbt.EvaluateTask$.runTask(EvaluateTask.scala:198)
	at sbt.Aggregation$$anonfun$3.apply(Aggregation.scala:67)
	at sbt.Aggregation$$anonfun$3.apply(Aggregation.scala:65)
	at sbt.EvaluateTask$.withStreams(EvaluateTask.scala:153)
	at sbt.Aggregation$.timedRun(Aggregation.scala:65)
	at sbt.Aggregation$.runTasks(Aggregation.scala:74)
	at sbt.Aggregation$$anonfun$applyTasks$1.apply(Aggregation.scala:34)
	at sbt.Aggregation$$anonfun$applyTasks$1.apply(Aggregation.scala:33)
	at sbt.Command$$anonfun$applyEffect$2$$anonfun$apply$3.apply(Command.scala:62)
	at sbt.Command$$anonfun$applyEffect$2$$anonfun$apply$3.apply(Command.scala:62)
	at sbt.Command$.process(Command.scala:95)
	at sbt.MainLoop$$anonfun$1$$anonfun$apply$1.apply(MainLoop.scala:87)
	at sbt.MainLoop$$anonfun$1$$anonfun$apply$1.apply(MainLoop.scala:87)
	at sbt.State$$anon$1.process(State.scala:176)
	at sbt.MainLoop$$anonfun$1.apply(MainLoop.scala:87)
	at sbt.MainLoop$$anonfun$1.apply(MainLoop.scala:87)
	at sbt.ErrorHandling$.wideConvert(ErrorHandling.scala:18)
	at sbt.MainLoop$.next(MainLoop.scala:87)
	at sbt.MainLoop$.run(MainLoop.scala:80)
	at sbt.MainLoop$$anonfun$runWithNewLog$1.apply(MainLoop.scala:69)
	at sbt.MainLoop$$anonfun$runWithNewLog$1.apply(MainLoop.scala:66)
	at sbt.Using.apply(Using.scala:25)
	at sbt.MainLoop$.runWithNewLog(MainLoop.scala:66)
	at sbt.MainLoop$.runAndClearLast(MainLoop.scala:49)
	at sbt.MainLoop$.runLoggedLoop(MainLoop.scala:33)
	at sbt.MainLoop$.runLogged(MainLoop.scala:25)
	at sbt.xMain.run(Main.scala:26)
	at xsbt.boot.Launch$$anonfun$run$1.apply(Launch.scala:57)
	at xsbt.boot.Launch$.withContextLoader(Launch.scala:77)
	at xsbt.boot.Launch$.run(Launch.scala:57)
	at xsbt.boot.Launch$$anonfun$explicit$1.apply(Launch.scala:45)
	at xsbt.boot.Launch$.launch(Launch.scala:65)
	at xsbt.boot.Launch$.apply(Launch.scala:16)
	at xsbt.boot.Boot$.runImpl(Boot.scala:32)
	at xsbt.boot.Boot$.main(Boot.scala:21)
	at xsbt.boot.Boot.main(Boot.scala)

"VM Thread" prio=5 tid=0x00007fce190bf800 nid=0x2903 runnable

"Gang worker#0 (Parallel GC Threads)" prio=5 tid=0x00007fce19802000 nid=0x2403 runnable

"Gang worker#1 (Parallel GC Threads)" prio=5 tid=0x00007fce1880a000 nid=0x2503 runnable

"Gang worker#2 (Parallel GC Threads)" prio=5 tid=0x00007fce19001800 nid=0x2603 runnable

"Gang worker#3 (Parallel GC Threads)" prio=5 tid=0x00007fce19006800 nid=0x2703 runnable

"Concurrent Mark-Sweep GC Thread" prio=5 tid=0x00007fce19081800 nid=0x2803 runnable
"VM Periodic Task Thread" prio=5 tid=0x00007fce190c1000 nid=0x4303 waiting on condition

JNI global references: 258

Heap
 par new generation   total 306688K, used 244810K [0x00000007b0000000, 0x00000007c4cc0000, 0x00000007c4cc0000)
  eden space 272640K,  80% used [0x00000007b0000000, 0x00000007bd611168, 0x00000007c0a40000)
  from space 34048K,  75% used [0x00000007c2b80000, 0x00000007c4481790, 0x00000007c4cc0000)
  to   space 34048K,   0% used [0x00000007c0a40000, 0x00000007c0a40000, 0x00000007c2b80000)
 concurrent mark-sweep generation total 222316K, used 93995K [0x00000007c4cc0000, 0x00000007d25db000, 0x00000007f0000000)
 concurrent-mark-sweep perm gen total 102544K, used 61513K [0x00000007f0000000, 0x00000007f6424000, 0x0000000800000000)

```
