DESCRIPTION = "github.com/samuel/go-zookeeper"

GO_IMPORT = "github.com/samuel/go-zookeeper"

inherit go

SRC_URI = "git://github.com/samuel/go-zookeeper;protocol=https;branch=master;destsuffix=${BPN}-${PV}/src/${GO_IMPORT}"
SRCREV = "1d7be4effb13d2d908342d349d71a284a7542693" 
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=0d3bff996e9a8f99d8ba45af7c9f6da7"

FILES:${PN} += "${GOBIN_FINAL}/*"
