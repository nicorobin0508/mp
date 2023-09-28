import 'package:flutter/material.dart';
void main() {
  runApp(MaterialApp(
    home: Home(),
  ));
}
class Home extends StatefulWidget {
  const Home({super.key});
  @override
  State<Home> createState() => _HomeState();
}
class _HomeState extends State<Home> with SingleTickerProviderStateMixin {
  late AnimationController controller;
  late Animation colorAnimation;
  late Animation sizeAnimation;
  @override
  void initState()
  {
    super.initState();
    controller =AnimationController(vsync: this, duration:
    Duration(seconds: 2));
    colorAnimation= ColorTween(begin: Colors.pinkAccent,end:
    Colors.purple).animate(controller);
    sizeAnimation=Tween<double>(begin: 400.0,end:
    800.0).animate(controller);
    controller.addListener(() {setState(() {
    });},);
        controller.repeat(reverse: true);
  }
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("animation demo "),
      ),
      body: Center(
        child: Icon(Icons.circle,
          size: sizeAnimation.value,
          color: colorAnimation.value,),
      ),
    );
  }
}
