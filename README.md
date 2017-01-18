# SVGColors
<p>Import SVP picture file to drawable folder, that make it easy to controle 
colors .</p>
<p>Add ImageView to your class:</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="background-color:#344134;">ImageView</span> <span style="color:#9876aa;">svgimage</span><span style="color:#cc7832;">;

</span><span style="color:#bbb529;">@Override
</span><span style="color:#cc7832;">protected void </span><span style="color:#ffc66d;">onCreate</span>(Bundle savedInstanceState) {
    <span style="color: #CC7832">.........................</span><span style="color:#cc7832;">
    </span><span style="color:#9876aa;">svgimage</span>=(<span style="background-color:#344134;">ImageView</span>)findViewById(R.id.<span style="color:#9876aa;font-style:italic;">image_svg</span>)<span style="color:#cc7832;">;</span>
    <span style="color: #CC7832">.........................</span></pre>

<p>Use online "rgb color picker" to choose a color:</p>
<p><a href="https://www.google.fr/?gws_rd=ssl#q=rgb+color+picker">
https://www.google.fr/?gws_rd=ssl#q=rgb+color+picker</a></p>
<p>
<img border="0" src="https://github.com/AymenSoft/SVGColors/blob/master/colors.gif"></p>
<p>Use java code to change the color of the SVG picture</p>
<pre style="background-color:#2b2b2b;color:#a9b7c6;font-family:'Courier New';font-size:12,0pt;"><span style="background-color:#344134;">svgimage</span>.setColorFilter(Color.<span style="font-style:italic;">rgb</span>(<span style="color:#6897bb;">242</span><span style="color:#cc7832;">, </span><span style="color:#6897bb;">16</span><span style="color:#cc7832;">, </span><span style="color:#6897bb;">16</span>))<span style="color:#cc7832;">;</span></pre>
<p>Then Run</p>
<p>
<img border="0" src="https://github.com/AymenSoft/SVGColors/blob/master/demo.gif"></p>
<br>
Enjoy Developping with simple trics from AymenSoft<br>
WebSite: www.aymen-soft.com<br>
Facebook: https://www.facebook.com/AymenSoft<br>
twitter: https://twitter.com/aymen_soft<br>
GooglePlus: https://plus.google.com/+AymenSoftOfficial<br>
Telegram: https://telegram.me/AymenSoftOfficial<br>
&nbsp;</p>
