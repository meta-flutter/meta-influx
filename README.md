This README file contains information on the contents of the
meta-influx layer.

The main goal of meta-influx is to install influxdb, telegraf and grafana on your system.


Dependencies
============

This layer depends on:

  - URI: git://github.com/mem/oe-meta-go.git
    - branch: master

  - URI: git://github.com/imyller/meta-nodejs.git
    - branch: master


Patches
=======

For bugreports please use Github issues and for bugfixes/patches Github pullrequests.




Adding the meta-influx layer to your build
=================================================

In order to use this layer, you need to make the build system aware of
it.

Assuming the meta-influx layer exists at the top-level of your
yocto build tree, you can add it to the build system by adding the
location of the meta-influx layer to bblayers.conf, along with any
other layers needed. e.g.:

  BBLAYERS ?= " \
    /path/to/yocto/meta \
    /path/to/yocto/meta-poky \
    /path/to/yocto/meta-yocto-bsp \
    /path/to/yocto/meta-go \
    /path/to/yocto/meta-influx \
    "

Adding influxdb, telegraf and grafana to your image
====================================================
IMAGE_INSTALL += "\
                    github.com-influxdata-influxdb \
                    github.com-influxdata-telegraf \
                    grafana-go \
                 "
 
