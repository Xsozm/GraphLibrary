:                          AddReg=TopologyNodeRegistration,PlugInRegistration,PinNameRegistration,DeviceRegistration,AudFNameRegistration  (ks.inf line 10)
     inf:                     {Install Inf Section [KS.Registration] exit (0x00000000)}
     inf:                     {Install Inf Section [WDMAUDIO.Registration]}
     inf:                          AddReg=DeviceRegistration  (wdmaudio.inf line 54)
     inf:                     {Install Inf Section [WDMAUDIO.Registration] exit (0x00000000)}
     inf:                     {Install Inf Section [mssysfx.CopyFilesAndRegister]}
     inf:                          11,,WMALFXGFXDSP.dll,1  (wdmaudio.inf line 112)
     inf:                          Processing REGISTERDLLS section [FX.RegisterDlls]. Module: '%11%\WMALFXGFXDSP.dll', flags: 0x0001, timeout: 300s, Arguments: '(null)'.
     inf:                          Calling 'DllRegisterServer' in OLE Control 'C:\Windows\system32\WMALFXGFXDSP.dll' succeeded.
     inf:                          11,,SysFxUI.dll,1  (wdmaudio.inf line 113)
     inf:                          Processing REGISTERDLLS section [FX.RegisterDlls]. Module: '%11%\SysFxUI.dll', flags: 0x0001, timeout: 300s, Arguments: '(null)'.
     inf:                          Calling 'DllRegisterServer' in OLE Control 'C:\Windows\system32\SysFxUI.dll' succeeded.
     inf:                     {Install Inf Section [mssysfx.CopyFilesAndRegister] exit (0x00000000)}
     inf:                     {Install Inf Section [HdAudModel.Hw]}
     inf:                          AddReg=HdAudSecurity.AddReg  (hdaudio.inf line 75)
     inf:                     {Install Inf Section [HdAudModel.Hw] exit (0x00000000)}
     dvi:                     {Writing Device Properties}
     dvi:                          Provider name=Microsoft
     dvi:                          DriverDate 07/13/2009
     dvi:                          DriverVersion=6.1.7600.16385
     dvi:                          Class name=MEDIA
     dvi:                          Manufacturer=Microsoft
     dvi:                          Matching DeviceID=hdaudio\func_01
     dvi:                          Strong Name=hdaudio.inf:Microsoft.ntamd64:HdAudModel:6.1.7600.16385::hdaudio\func_01
     dvi:                     {Writing Device Properties - Complete}
     inf:                     {Install Inf Section [HdAudModel.Services]}
     inf:                          AddService=HdAudAddService,0x00000002,HdAud_Service_Install  (hdaudio.inf line 79)
     inf:                          ServiceType=1  (hdaudio.inf line 83)
     inf:                          StartType=3  (hdaudio.inf line 84)
     inf:                          ErrorControl=1  (hdaudio.inf line 85)
     inf:                          ServiceBinary=C:\Windows\system32\drivers\HdAudio.sys  (hdaudio.inf line 86)
     inf:                          DisplayName="Microsoft 1.1 UAA Function Driver for High Definition Audio Service"  (hdaudio.inf line 82)
     dvi:                          Add Service: Created service 'HdAudAddService'.
     inf:                     {Install Inf Section [HdAudModel.Services] exit(0x00000000)}
     dvi:                     Updated reflected section names for: hdaudio.inf
     dvi:                {Install DEVICE exit (0x00000000)}
     dvi:                Writing common driver property settings.
     dvi:                     DriverDescription=High Definition Audio Device
     dvi:                     DeviceDisplayName=High Definition Audio Device
     dvi:                {Restarting Devices} 01:21:05.802
     dvi:                     Restart: HDAUDIO\FUNC_01&VEN_10EC&DEV_0236&SUBSYS_17AA3808&REV_1000\4&36158B24&0&0001
     dvi:                     Restart complete.
     dvi:                {Restarting Devices exit} 01:21:05.974
     dvi:           Class installer: Exit
     dvi:           CoInstaller 1: Enter (Post Processing) 01:21:06.005
     dvi:           CoInstaller 1: Exit (Post Processing)
     dvi:      {DIF_INSTALLDEVICE - exit(0x00000000)} 01:21:06.005
     inf:      Opened INF: 'C:\Windows\INF\ksfilter.inf