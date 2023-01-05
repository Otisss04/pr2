package de.bht.pr2.lession08.ui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.RouterLink;
import de.bht.pr2.lession08.ui.contacts.ContactsView;
import de.bht.pr2.lession08.ui.hello.HelloView;

public class MainLayout extends AppLayout {

  public MainLayout() {
    createHeader();
    createDrawer();
  }

  private void createHeader() {
    H1 logo = new H1("Programmierung 2!");
    logo.addClassNames("text-l", "m-m");

    HorizontalLayout header = new HorizontalLayout(new DrawerToggle(), logo);

    header.setDefaultVerticalComponentAlignment(FlexComponent.Alignment.CENTER);
    header.expand(logo);
    header.setWidth("100%");
    header.addClassNames("py-0", "px-m");

    addToNavbar(header);

  }

  private void createDrawer() {
    RouterLink helloLink = new RouterLink("Say Hello", HelloView.class);
    helloLink.setHighlightCondition(HighlightConditions.sameLocation());

    RouterLink listLink = new RouterLink("Contacts", ContactsView.class);
    listLink.setHighlightCondition(HighlightConditions.sameLocation());

    addToDrawer(new VerticalLayout(
        helloLink,
        listLink
    ));
  }
}
