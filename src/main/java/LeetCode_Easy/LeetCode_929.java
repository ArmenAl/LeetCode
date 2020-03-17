package LeetCode_Easy;

import java.util.HashSet;

public class LeetCode_929 {
    public static void main(String[] args) {
        String[] s = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        String[] s1 = {"fg.r.u.uzj+o.pw@kziczvh.com","r.cyo.g+d.h+b.ja@tgsg.z.com","fg.r.u.uzj+o.f.d@kziczvh.com","r.cyo.g+ng.r.iq@tgsg.z.com","fg.r.u.uzj+lp.k@kziczvh.com","r.cyo.g+n.h.e+n.g@tgsg.z.com","fg.r.u.uzj+k+p.j@kziczvh.com","fg.r.u.uzj+w.y+b@kziczvh.com","r.cyo.g+x+d.c+f.t@tgsg.z.com","r.cyo.g+x+t.y.l.i@tgsg.z.com","r.cyo.g+brxxi@tgsg.z.com","r.cyo.g+z+dr.k.u@tgsg.z.com","r.cyo.g+d+l.c.n+g@tgsg.z.com","fg.r.u.uzj+vq.o@kziczvh.com","fg.r.u.uzj+uzq@kziczvh.com","fg.r.u.uzj+mvz@kziczvh.com","fg.r.u.uzj+taj@kziczvh.com","fg.r.u.uzj+fek@kziczvh.com"};
        numUniqueEmails(s1);
    }

    public static int numUniqueEmails(String[] emails) {

        HashSet set = new HashSet();
        for (int i = 0; i < emails.length; i++) {
            String s = emails[i];;
            String s1 = "";
            String s2 = "";
            String s3 = "";

            System.out.println(s);
            boolean foundPlus = false;
            for (int j = 0; j < emails[i].length(); j++) {
                if (!foundPlus && emails[i].charAt(j) == '+') {
                    s3 = emails[i].substring(0, j);
                    foundPlus = true;
                }
                if (emails[i].charAt(j) == '@') {
                    s1 = emails[i].substring(0, j);
                    s2 = emails[i].substring(j);
                }
            }
            if (!s3.equals("")) {
                s3 = s3.replaceAll("\\.", "");
                set.add(s3 + s2);
                System.out.println(s3 + s2);
                set.size();
            } else {
                s1 = s1.replaceAll("\\.", "");
                set.add(s1 + s2);
                System.out.println(s1 + s2);
            }
        }

        System.out.println(set.size());
        return set.size();
    }
}

