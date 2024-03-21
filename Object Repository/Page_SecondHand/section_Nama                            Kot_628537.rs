<?xml version="1.0" encoding="UTF-8"?>
<WebElementEntity>
   <description></description>
   <name>section_Nama                            Kot_628537</name>
   <tag></tag>
   <elementGuidId>d56c441c-afb1-409b-b845-9bd79a702b11</elementGuidId>
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
      <webElementGuid>c6e3a7ab-8c5f-45a5-9d77-6aecaf8b7748</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>class</name>
      <type>Main</type>
      <value>pt-5 mt-5</value>
      <webElementGuid>cff57644-030c-4b20-9b88-2adbd913a9a4</webElementGuid>
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
        Jl. Budi Mulia 01
      

      
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
      <webElementGuid>bdfeaf85-a712-4f91-b9c9-add813884fee</webElementGuid>
   </webElementProperties>
   <webElementProperties>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath</name>
      <type>Main</type>
      <value>/html[1]/body[1]/section[@class=&quot;pt-5 mt-5&quot;]</value>
      <webElementGuid>95cd35f6-7377-4804-ba5d-e9f84be7ff22</webElementGuid>
   </webElementProperties>
   <webElementXpaths>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:neighbor</name>
      <type>Main</type>
      <value>(.//*[normalize-space(text()) and normalize-space(.)='Lengkapi Info Akun'])[1]/following::section[1]</value>
      <webElementGuid>ac04b75e-4f66-4a6b-b572-1e38d2cc833a</webElementGuid>
   </webElementXpaths>
   <webElementXpaths>
      <isSelected>false</isSelected>
      <matchCondition>equals</matchCondition>
      <name>xpath:position</name>
      <type>Main</type>
      <value>//section</value>
      <webElementGuid>4861c18a-d845-4ea0-a869-0541bc208ea1</webElementGuid>
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
        Jl. Budi Mulia 01
      

      
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
        Jl. Budi Mulia 01
      

      
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
      <webElementGuid>cc86d0d0-ec9a-4ec0-86e0-1bda96dd770a</webElementGuid>
   </webElementXpaths>
</WebElementEntity>
