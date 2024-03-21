<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>section_Nama                            Kot_bf4fc9</name>
   <tag></tag>
   <elementGuidId>6b780633-53b3-41a3-a0fe-8551ea9e6a91</elementGuidId>
   <selectorCollection>
      <entry>
         <key>CSS</key>
         <value>section.pt-5.mt-5</value>
      </entry>
      <entry>
         <key>XPATH</key>
         <value>(.//*[normalize-space(text()) and normalize-space(.)='Lengkapi Info Akun'])[1]/following::section[1]</value>
      </entry>
   </selectorCollection>
   <selectorMethod>XPATH</selectorMethod>
   <useRalativeImagePath>true</useRalativeImagePath>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>tag</name>
      <type>Main</type>
      <value>section</value>
      <webElementGuid>0bb338ad-320a-45ca-975d-38f60fd049de</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>pt-5 mt-5</value>
      <webElementGuid>671f84fc-6c6e-47e3-a756-20230c54a027</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>text</name>
      <type>Main</type>
      <value>
      
  
  
    
  


  
  
    

      
        
            
              
            

          
        
      

      
        Nama
        
      

      
        Kota
        Pilih Kota
Solo
Jogja
Jakarta
Bandung
Semarang
      

      
        Alamat
        
      

      
        No Handphone
        
      

      
        
      
  



  var formAvatarView = document.getElementById('form-avatar-view')
  var formAvatarInput = document.getElementById('form-avatar-input')
  var formAvatar = document.getElementById('form-avatar')
  var formAvatarImage = document.getElementById('form-avatar-image')
  var image;

  formAvatarView.addEventListener('click', function(e) {
    formAvatar.click();
  });

  formAvatar.addEventListener('change', function () {
    if (!!formAvatarImage) {
      formAvatarImage.style[&quot;display&quot;] = &quot;none&quot;;
    }

    if (!!image) {
      image.remove();
    }

    for (const file of formAvatar.files) {
      image = document.createElement('img');
      image.classList.add(&quot;p-0&quot;, &quot;img-thumbnail&quot;, &quot;img-avatar-profile&quot;, &quot;overflow-hidden&quot;, &quot;rounded-4&quot;, &quot;border-0&quot;);
      image.src = URL.createObjectURL(file);
      formAvatarView.prepend(image);
      formAvatarInput.style['display'] = 'none';
    }
  });




    </value>
      <webElementGuid>254672c4-5433-4f14-b415-108840237c90</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/section[@class=&quot;pt-5 mt-5&quot;]</value>
      <webElementGuid>6217ce7f-2da7-4a3a-9063-2c57981c701d</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Lengkapi Info Akun'])[1]/following::section[1]</value>
      <webElementGuid>c64fd999-6145-46cc-b0fa-842c317c4368</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//section</value>
      <webElementGuid>195e5fbb-26bc-462e-968f-f2dd399c3233</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:customAttributes</name>
      <type>Main</type>
      <value>//section[(text() = concat(&quot;
      
  
  
    
  


  
  
    

      
        
            
              
            

          
        
      

      
        Nama
        
      

      
        Kota
        Pilih Kota
Solo
Jogja
Jakarta
Bandung
Semarang
      

      
        Alamat
        
      

      
        No Handphone
        
      

      
        
      
  



  var formAvatarView = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-view&quot; , &quot;'&quot; , &quot;)
  var formAvatarInput = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-input&quot; , &quot;'&quot; , &quot;)
  var formAvatar = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar&quot; , &quot;'&quot; , &quot;)
  var formAvatarImage = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-image&quot; , &quot;'&quot; , &quot;)
  var image;

  formAvatarView.addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function(e) {
    formAvatar.click();
  });

  formAvatar.addEventListener(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function () {
    if (!!formAvatarImage) {
      formAvatarImage.style[&quot;display&quot;] = &quot;none&quot;;
    }

    if (!!image) {
      image.remove();
    }

    for (const file of formAvatar.files) {
      image = document.createElement(&quot; , &quot;'&quot; , &quot;img&quot; , &quot;'&quot; , &quot;);
      image.classList.add(&quot;p-0&quot;, &quot;img-thumbnail&quot;, &quot;img-avatar-profile&quot;, &quot;overflow-hidden&quot;, &quot;rounded-4&quot;, &quot;border-0&quot;);
      image.src = URL.createObjectURL(file);
      formAvatarView.prepend(image);
      formAvatarInput.style[&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;] = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
    }
  });




    &quot;) or . = concat(&quot;
      
  
  
    
  


  
  
    

      
        
            
              
            

          
        
      

      
        Nama
        
      

      
        Kota
        Pilih Kota
Solo
Jogja
Jakarta
Bandung
Semarang
      

      
        Alamat
        
      

      
        No Handphone
        
      

      
        
      
  



  var formAvatarView = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-view&quot; , &quot;'&quot; , &quot;)
  var formAvatarInput = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-input&quot; , &quot;'&quot; , &quot;)
  var formAvatar = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar&quot; , &quot;'&quot; , &quot;)
  var formAvatarImage = document.getElementById(&quot; , &quot;'&quot; , &quot;form-avatar-image&quot; , &quot;'&quot; , &quot;)
  var image;

  formAvatarView.addEventListener(&quot; , &quot;'&quot; , &quot;click&quot; , &quot;'&quot; , &quot;, function(e) {
    formAvatar.click();
  });

  formAvatar.addEventListener(&quot; , &quot;'&quot; , &quot;change&quot; , &quot;'&quot; , &quot;, function () {
    if (!!formAvatarImage) {
      formAvatarImage.style[&quot;display&quot;] = &quot;none&quot;;
    }

    if (!!image) {
      image.remove();
    }

    for (const file of formAvatar.files) {
      image = document.createElement(&quot; , &quot;'&quot; , &quot;img&quot; , &quot;'&quot; , &quot;);
      image.classList.add(&quot;p-0&quot;, &quot;img-thumbnail&quot;, &quot;img-avatar-profile&quot;, &quot;overflow-hidden&quot;, &quot;rounded-4&quot;, &quot;border-0&quot;);
      image.src = URL.createObjectURL(file);
      formAvatarView.prepend(image);
      formAvatarInput.style[&quot; , &quot;'&quot; , &quot;display&quot; , &quot;'&quot; , &quot;] = &quot; , &quot;'&quot; , &quot;none&quot; , &quot;'&quot; , &quot;;
    }
  });




    &quot;))]</value>
      <webElementGuid>20e95d3c-014a-42ce-b0c7-158600d9aa25</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
