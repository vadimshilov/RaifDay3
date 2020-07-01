package com.github.vadimshilov;

public final class Compressor {

  public static String compress(String str) {
    if (str == null) {
      return null;
    }
    int index = 0;
    StringBuilder resultBuilder = new StringBuilder();
    while (index < str.length()) {
      char curChar = str.charAt(index);
      int nextIndex = index + 1;
      while (nextIndex < str.length() && str.charAt(nextIndex) == curChar) {
        nextIndex++;
      }
      int count = nextIndex - index;
      if (count != 1) {
        resultBuilder.append(count);
      }
      resultBuilder.append(curChar);
      index = nextIndex;
    }
    return resultBuilder.toString();
  }

  /*
  Не знаю, как сделать решение оригинальным, поэтому держите кота
                   ,
                   \`-._           __
                    \\  `-..____,.'  `.
                     :`.         /    \`.
                     :  )       :      : \
                      ;'        '   ;  |  :
                      )..      .. .:.`.;  :
                     /::...  .:::...   ` ;
                     ; _ '    __        /:\
                     `:o>   /\o_>      ;:. `.
                    `-`.__ ;   __..--- /:.   \
                    === \_/   ;=====_.':.     ;
                     ,/'`--'...`--....        ;
                          ;                    ;
                        .'                      ;
                      .'                        ;
                    .'     ..     ,      .       ;
                   :       ::..  /      ;::.     |
                  /      `.;::.  |       ;:..    ;
                 :         |:.   :       ;:.    ;
                 :         ::     ;:..   |.    ;
                  :       :;      :::....|     |
                  /\     ,/ \      ;:::::;     ;
                .:. \:..|    :     ; '.--|     ;
               ::.  :''  `-.,,;     ;'   ;     ;
            .-'. _.'\      / `;      \,__:      \
            `---'    `----'   ;      /    \,.,,,/
   */

}
