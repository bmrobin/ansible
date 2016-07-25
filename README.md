## An introduction to Ansible for the Montgomery County Java User Group (MCJUG).

#### Overview
This repository contains the source code to build a very simply Java application and the Ansible resources to
deploy it to a remote server. For installation information of the Java application, see the previous MCJUG topic I presented
[here](https://github.com/bmrobin/springBoot).

#### Installation on Controlling Machine
Requires Python 2.6 or 2.7. Windows is not currently supported as a controlling machine, however it is supported as
a remote machine. No software installation is required on the remote machines, provided they expose an SSH port.

    $ sudo easy_install pip
    $ sudo pip install ansible
    
#### Usage
    $ ./gradlew clean build
    $ ansible-playbook -i environments/dev/dev.ini playbooks/deploy-app.yaml

#### Assumptions
Currently the Ansible inventory file in ```environments/dev/dev.ini``` references a CentOS-based host named 10.0.0.114. 
This is obviously not your server, so replace this IP address with the IP or hostname of your choice. Because my host is
CentOS-based, Yum is used as the package manager to install the Java 8 JDK. This package manager may vary depending on the OS
of your host. SSH access to the remote machine is assumed for this example. This overview to Ansible does not cover 
topics like establishing said SSH access or guaranteeing that access will not be blocked by firewall or other limitations.
