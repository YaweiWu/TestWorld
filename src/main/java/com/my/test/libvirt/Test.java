package com.my.test.libvirt;

import org.libvirt.Connect;
import org.libvirt.Domain;
import org.libvirt.LibvirtException;

public class Test {

	public static void main(String[] args) {
		Connect conn = null;
		try {
			conn = new Connect("qemu:///system", false);
		} catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
		}
		try {
			for (int domainId : conn.listDomains()) {

				Domain domain = conn.domainLookupByID(domainId);

				System.out.println("Domain:" + domain.getName() + " id "
						+ domain.getID() + " running " + domain.getOSType());

				System.out.println(domain.getXMLDesc(0));

			}
		} catch (LibvirtException e) {
			System.out.println("exception caught:" + e);
			System.out.println(e.getError());
		}

	}

}
