import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      home: Home()
  ));
}
class Home extends StatefulWidget {
  const Home({super.key});

  @override
  State<Home> createState() => _HomeState();
}

class _HomeState extends State<Home> {
  bool _lightIsOn=false;
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text('Gestures Detector'),
        backgroundColor: Colors.amber,),
      body:Container(
        child: Column(
          children: [
            Center(
              child: Icon(Icons.lightbulb_circle_outlined,
              color: _lightIsOn?Colors.yellow.shade600 : Colors.black,
              size:100,),),
      GestureDetector(
        onTap: (){
          setState(() {
            _lightIsOn=!_lightIsOn;
            final snackBar=SnackBar(content: Text('Tap Function'));
            ScaffoldMessenger.of(context).showSnackBar(snackBar);
          });
        },
        onDoubleTap: (){
          setState(() {
            _lightIsOn=!_lightIsOn;
            final snackBar=SnackBar(content: Text('Double Tap Function'));
            ScaffoldMessenger.of(context).showSnackBar(snackBar);
          });
        },
        onLongPress: (){
          setState(() {
            _lightIsOn=!_lightIsOn;
            final snackBar=SnackBar(content: Text('Long Press Function'));
            ScaffoldMessenger.of(context).showSnackBar(snackBar);
          });
        },
        child: Text(_lightIsOn?'Turn Light Off':'Turn Light On'),
      )
          ],
        ),
      ),
      );
  }
}
