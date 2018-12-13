nf_amd64_neutral_423c286802951189\keyboard.inf' ([strings.0409])
     dvi:                     Installing section [STANDARD_Inst.Interfaces]
     dvi:                {Install INTERFACES exit 00000000}
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLINTERFACES - exit(0x00000000)} 01:21:04.554
     ndv:      Installing device...
     dvi:      {DIF_INSTALLDEVICE} 01:21:04.554
     dvi:           CoInstaller 1: Enter 01:21:04.554
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.554
     inf:                Opened PNF: 'C:\Windows\INF\keyboard.inf' ([strings.0409])
     dvi:                {Install DEVICE}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\keyboard.inf_amd64_neutral_423c286802951189\keyboard.inf' ([strings.0409])
     dvi:                     Processing Registry/Property directives...
     inf:                     {Install Inf Section [STANDARD_Inst]}
     inf:                          AddReg=STANDARD_AddReg  (keyboard.inf line 266)
     inf:                     {Install Inf Section [STANDARD_Inst] exit (0x00000000)}
     inf:                     {Install Inf Section [STANDARD_Inst.Hw]}
     inf:                          AddReg=STANDARD_AddReg.HW  (keyboard.inf line 279)
     inf:                     {Install Inf Section [STANDARD_Inst.Hw] exit (0x00000000)}
     dvi:                     {Writing Device Properties}
     dvi:                          Provider name=Microsoft
     dvi:                          DriverDate 06/21/2006
     dvi:                          DriverVersion=6.1.7600.16385
     dvi:                          Class name=Keyboard
     dvi:                          Manufacturer=(Standard keyboards)
     dvi:                          Matching DeviceID=*pnp0303
     dvi:                          Strong Name=keyboard.inf:MS_KBD.NTamd64:STANDARD_Inst:6.1.7600.16385:*pnp0303
     dvi:                     {Writing Device Properties - Complete}
     inf:                     {Install Inf Section [STANDARD_Inst.Services]}
     inf:                          AddService=i8042prt,0x00000002,STANDARD_i8042prt_Service_Inst,i8042prt_EventLog_Inst  (keyboard.inf line 275)
     inf:                          ServiceType=1  (keyboard.inf line 297)
     inf:                          StartType=3  (keyboard.inf line 298)
     inf:                          ErrorControl=1  (keyboard.inf line 299)
     inf:                          ServiceBinary=C:\Windows\system32\DRIVERS\i8042prt.sys  (keyboard.inf line 300)
     inf:                          DisplayName="i8042 Keyboard and PS/2 Mouse Port Driver"  (keyboard.inf line 296)
     inf:                          LoadOrderGroup="Keyboard Port"  (keyboard.inf line 301)
     dvi:                          Add Service: Modified existing service 'i8042prt'.
     inf:                          AddReg=STANDARD_i8042prt_Service_AddReg  (keyboard.inf line 302)
     inf:                          AddReg=i8042prt_EventLog_AddReg  (keyboard.inf line 531)
     inf:                          AddService=kbdclass,,kbdclass_Service_Inst,kbdclass_EventLog_Inst  (keyboard.inf line 276)
     inf:                          ServiceType=1  (keyboard.inf line 539)
     inf:                          StartType=3  (keyboard.inf line 540)
     inf:                          ErrorControl=1  (keyboard.inf line 541)
     inf:                          ServiceBinary=C:\Windows\system32\DRIVERS\kbdclass.sys  (keyboard.inf line 542)
     inf:                          DisplayName="Keyboard Class Driver"  (keyboard.inf line 538)
     inf:                          LoadOrderGroup="Keyboard Class"  (keyboard.inf line 543)
     dvi:                          Add Service: Modified existing service 'kbdclass'.
     inf:                          AddReg=kbdclass_EventLog_AddReg  (keyboard.inf line 546)
     inf:                     {Install Inf Section [STANDARD_Inst.Services] exit(0x00000000)}
     dvi:                     Updated reflected section names for: keyboard.inf
     dvi:                {Install DEVICE exit (0x00000000)}
     dvi:                Writing common driver property settings.
     dvi:                     DriverDescription=Standard PS/2 Keyboard
     dvi:                     DeviceDisplayName=Standard PS/2 Keyboard
     dvi:                Install Device: Removing device sub-tree. 01:21:04.695
     dvi:                Install Device: Removing device sub-tree completed. 01:21:04.773
!    dvi:                Query-removal during install of 'ACPI\MSFT0001\4&26844B76&0' was vetoed by 'ACPI\MSFT0001\4&26844b76&0' (veto type 6: PNP_VetoDevice).
!    dvi:                Device required reboot: Query remove failed (install) 0x17: CR_REMOVE_VETOED.
     dvi:           Class installer: Exit
     dvi:           CoInstaller 1: Enter (Post Processing) 01:21:04.788
     dvi:           CoInstaller 1: Exit (Post Processing)
     dvi:      {DIF_INSTALLDEVICE - exit(0x00000000)} 01:21:04.788
     ndv:      Needs reboot=TRUE
     dvi:      {DIF_NEWDEVICEWIZARD_FINISHINSTALL} 01:21:04.788
     dvi:           CoInstaller 1: Enter 01:21:04.788
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.788
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:04.788
     dvi:           Default installer: Exit
     dvi:      {DIF_NEWDEVICEWIZARD_FINISHINSTALL - exit(0xe000020e)} 01:21:04.788
     ndv:      Device install status=0x00000000
     ndv:      Performing device install final cleanup...
     ndv: {Core Device Install - exit(0x00000000)} 01:21:04.788
     dvi: {DIF_DESTROYPRIVATEDATA} 01:21:04.788
     dvi:      CoInstaller 1: Enter 01:21:04.788
     dvi:      CoInstaller 1: Exit
     dvi:      Class installer: Enter 01:21:04.788
     dvi:      Class installer: Exit
     dvi:      Default installer: Enter 01:21:04.788
     dvi:      Default installer: Exit
     dvi: {DIF_DESTROYPRIVATEDATA - exit(0xe000020e)} 01:21:04.788
     ump: Server install process exited with code 0x00000000 01:21:04.804
<<<  Section end 2015/09/25 01:21:04.804
<<<  [Exit status: SUCCESS]


>>>  [Setup online Device Install (Hardware initiated) - hdaudio\func_01&ven_10ec&dev_0236&subsys_17aa3808&rev_1000\4&36158b24&0&0001]
>>>  Section start 2015/09/25 01:21:01.949
     ump: Creating Install Process: DrvInst.exe 01:21:01.949
     ndv: Retrieving device info...
     ndv: Setting device parameters...
     ndv: Searching Driver Store and Device Path...
     dvi: {Build Driver List} 01:21:01.949
     dvi:      Searching for hardware ID(s):
     dvi:           hdaudio\func_01&ven_10ec&dev_0236&subsys_17aa3808&rev_1000
     dvi:           hdaudio\func_01&ven_10ec&dev_0236&subsys_17aa3808
     dvi:      Searching for compatible ID(s):
     dvi:           hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec&dev_0236&rev_1000
     dvi:           hdaudio\func_01&ctlr_ven_8086&ven_10ec&dev_0236&rev_1000
     dvi:           hdaudio\func_01&ven_10ec&dev_0236&rev_1000
     dvi:           hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec&dev_0236
     dvi:           hdaudio\func_01&ctlr_ven_8086&ven_10ec&dev_0236
     dvi:           hdaudio\func_01&ven_10ec&dev_0236
     dvi:           hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0&ven_10ec
     dvi:           hdaudio\func_01&ctlr_ven_8086&ven_10ec
     dvi:           hdaudio\func_01&ven_10ec
     dvi:           hdaudio\func_01&ctlr_ven_8086&ctlr_dev_9ca0
     dvi:           hdaudio\func_01&ctlr_ven_8086
     dvi:           hdaudio\func_01&gf&ven_10ec&dev_0236&subsys_17aa3808&rev_1000
     dvi:           hdaudio\func_01
     cpy:      Policy is set to make all digital signatures equal.
     dvi:      Enumerating INFs from path list 'C:\Windows\inf'
     inf:      Opened INF: 'C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.inf' ([strings.0409])
     inf:      Saved PNF: 'C:\Windows\System32\DriverStore\FileRepository\hdaudio.inf_amd64_neutral_cb351613c92a9f31\hdaudio.PNF' (Language = 0409)