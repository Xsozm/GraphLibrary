00000000)}
     flq:                          {FILE_QUEUE_COPY exit(0x00000000)}
     inf:                     {Install Inf Section [STANDARD_Inst] exit (0x00000000)}
     dvi:                     Processing co-installer registration section [STANDARD_Inst.CoInstallers].
     inf:                     {Install Inf Section [STANDARD_Inst.CoInstallers]}
     inf:                     {Install Inf Section [STANDARD_Inst.CoInstallers] exit (0x00000000)}
     dvi:                     Co-installers registered.
     dvi:                     {Install INTERFACES}
     dvi:                          Installing section [STANDARD_Inst.Interfaces]
     dvi:                     {Install INTERFACES exit 00000000}
     dvi:                {Install FILES exit (0x00000000)}
     dvi:           Default installer: Exit
     dvi:      {DIF_INSTALLDEVICEFILES - exit(0x00000000)} 01:21:04.554
     ndv:      Pruning file queue...
     dvi:      {_SCAN_FILE_QUEUE}
     flq:           ScanQ flags=620
     flq:                SPQ_SCAN_PRUNE_COPY_QUEUE
     flq:                SPQ_SCAN_FILE_COMPARISON
     flq:                SPQ_SCAN_ACTIVATE_DRP
     flq:           ScanQ number of copy nodes=2
     flq:           File 'C:\Windows\system32\DRIVERS\i8042prt.sys' pruned from copy.
     cpy:           DrpSetRegFileProt 'C:\Windows\system32\DRIVERS\i8042prt.sys' Status=0 Class=Inbox Windows protected
     flq:           File 'C:\Windows\system32\DRIVERS\kbdclass.sys' pruned from copy.
     cpy:           DrpSetRegFileProt 'C:\Windows\system32\DRIVERS\kbdclass.sys' Status=0 Class=Inbox Windows protected
     flq:           ScanQ action=200 DoPruning=32
     flq:           ScanQ end Validity flags=620 CopyNodes=0
     dvi:      {_SCAN_FILE_QUEUE exit(0, 0x00000000)}
     ndv:      Committing file queue...
     flq:      {_commit_file_queue}
     flq:           CommitQ DelNodes=0 RenNodes=0 CopyNodes=0
     flq:           CommitQ early exit: No nodes are queued
     flq:      {_commit_file_queue exit OK}
     ndv:      Registering CoInstallers...
     dvi:      {DIF_REGISTER_COINSTALLERS} 01:21:04.554
     dvi:           CoInstaller 1: Enter 01:21:04.554
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.554
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:04.554
     inf:                Opened PNF: 'c:\windows\system32\driverstore\filerepository\keyboard.inf_amd64_neutral_423c286802951189\keyboard.inf' ([strings.0409])
     inf:                {Install Inf Section [STANDARD_Inst.CoInstallers]}
     inf:                {Install Inf Section [STANDARD_Inst.CoInstallers] exit (0x00000000)}
     dvi:                {DIF_DESTROYPRIVATEDATA} 01:21:04.554
     dvi:                     CoInstaller 1: Enter 01:21:04.554
     dvi:                     CoInstaller 1: Exit
     dvi:                     Class installer: Enter 01:21:04.554
     dvi:                     Class installer: Exit
     dvi:                     Default installer: Enter 01:21:04.554
     dvi:                     Default installer: Exit
     dvi:                {DIF_DESTROYPRIVATEDATA - exit(0xe000020e)} 01:21:04.554
     dvi:                Co-installers registered.
     dvi:           Default installer: Exit
     dvi:      {DIF_REGISTER_COINSTALLERS - exit(0x00000000)} 01:21:04.554
     ndv:      Installing interfaces...
     dvi:      {DIF_INSTALLINTERFACES} 01:21:04.554
     dvi:           Using exported function 'CriticalDeviceCoInstaller' in module 'C:\Windows\system32\SysClass.Dll'.
     dvi:           CoInstaller 1 == SysClass.Dll,CriticalDeviceCoInstaller
     dvi:           CoInstaller 1: Enter 01:21:04.554
     dvi:           CoInstaller 1: Exit
     dvi:           Class installer: Enter 01:21:04.554
     dvi:           Class installer: Exit
     dvi:           Default installer: Enter 01:21:04.554
     dvi:                {Install INTERFACES}
     inf:                     Opened PNF: 'c:\windows\system32\driverstore\filerepository\keyboard.i