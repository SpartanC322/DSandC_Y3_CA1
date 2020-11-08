package gui;

import javax.swing.JFrame;
import spelling.Dictionary;
import spelling.DictionaryHashSet;
import spelling.DictionaryLinkedList;
import spelling.DictionaryTreeSet;

public class TextEditorMain
{  
   public static void main(String[] args)
   {  
      Dictionary dictionary = new DictionaryTreeSet();
      JFrame frame = new TextEditorFrame(dictionary);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
