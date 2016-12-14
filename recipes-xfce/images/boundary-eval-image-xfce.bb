DESCRIPTION = "A XFCE desktop demo image."

IMAGE_FEATURES += "splash package-management ssh-server-dropbear hwcodecs dev-pkgs"

LICENSE = "MIT"

inherit core-image distro_features_check

REQUIRED_DISTRO_FEATURES = "x11"

CORE_IMAGE_BASE_INSTALL += "\
	packagegroup-core-boot \
	${ROOTFS_PKGMANAGE_BOOTSTRAP} \
	packagegroup-core-x11 \
	packagegroup-xfce-base \
	kernel-modules \
	\
	nodejs \
	packagegroup-fsl-gstreamer1.0-full \
	\
	flex \
	gcc \
	git \
	m4 \
	make \
	iperf \
	libtool \
	nano \
	python-compiler \
	strace \
	screen \
	minicom \
	openssl \
	cryptodev-module \
"

# Video input demos only on nitrogen6x/sx/7 platform
# Chromium not on nitrogen7
CORE_IMAGE_BASE_INSTALL_append_nitrogen6x += "video-input-icon chromium firefox"
CORE_IMAGE_BASE_INSTALL_append_nitrogen6x-lite += "chromium firefox"
CORE_IMAGE_BASE_INSTALL_append_nitrogen6sx += "video-input-icon chromium firefox"
CORE_IMAGE_BASE_INSTALL_append_nitrogen7 += "video-input-icon"
